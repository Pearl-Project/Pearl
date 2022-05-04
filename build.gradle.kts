import io.papermc.paperweight.util.constants.*

plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.1.2"
    id("io.papermc.paperweight.patcher") version "1.3.6"
}

repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/") {
        content {
            onlyForConfigurations(PAPERCLIP_CONFIG)
        }
    }
}

dependencies {
    remapper("net.fabricmc:tiny-remapper:0.8.1:fat")
    decompiler("net.minecraftforge:forgeflower:1.5.498.29")
    paperclip("io.papermc:paperclip:3.0.2")
}

subprojects {
    apply(plugin = "java")

    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        toolchain {
            languageVersion.set(JavaLanguageVersion.of(17)) 
        }
    }

    tasks.withType<JavaCompile>().configureEach {
        options.encoding = "UTF-8"
        options.release.set(17)
    }

    repositories {
        mavenLocal()
        mavenCentral()
        maven("https://oss.sonatype.org/content/groups/public/")
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://ci.emc.gs/nexus/content/groups/aikar/")
        maven("https://repo.aikar.co/content/groups/aikar")
        maven("https://repo.md-5.net/content/repositories/releases/")
        maven("https://hub.spigotmc.org/nexus/content/groups/public/")
        maven("https://jitpack.io")
    }
}

paperweight {
    serverProject.set(project(":pearl-server"))

    remapRepo.set("https://maven.fabricmc.net/")
    decompileRepo.set("https://files.minecraftforge.net/maven/")

    useStandardUpstream("pufferfish") {
        url.set(github("pufferfish-gg", "Pufferfish"))
        ref.set(providers.gradleProperty("pufferfishCommit"))

        withStandardPatcher {
            apiSourceDirPath.set("pufferfish-api")
            serverSourceDirPath.set("pufferfish-server")

            apiPatchDir.set(layout.projectDirectory.dir("patches/api"))
            serverPatchDir.set(layout.projectDirectory.dir("patches/server"))

            apiOutputDir.set(layout.projectDirectory.dir("Pearl-API"))
            serverOutputDir.set(layout.projectDirectory.dir("Pearl-Server"))
        }
    }
}