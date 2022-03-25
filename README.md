<div align="center">
<img src="https://i.imgur.com/eTW6JQh.png" alt="Pearl">
  
## Pearl Project

[![Build status](https://img.shields.io/github/workflow/status/Pearl-Project/Pearl/Build?logo=github&style=for-the-badge)](https://github.com/Pearl-Project/Pearl/actions)
[![Minecraft version](https://img.shields.io/static/v1?label=Minecraft&message=1.18.2&color=green&logo=java&style=for-the-badge)](https://www.minecraft.net/en-us/article/minecraft-java-edition-1-18-2)
[![Discord](https://img.shields.io/discord/951410587030667294.svg?label=&logo=discord&logoColor=ffffff&color=7389D8&labelColor=6A7EC2&style=for-the-badge)](https://discord.gg/ZFAtK5Mx9w)
  
Pearl is a fork of [PurpurMC](https://github.com/PurpurMC/Purpur) that offers optimization and stability
  
</div>

## Features

* All [Pufferfish](https://github.com/pufferfish-gg/Pufferfish) and [Purpur](https://github.com/PurpurMC/Purpur) features
* Better handling of async tasks
* DataConverter for itemstack entity
* Optimize despawn
* Alternate Current redstone
* Improved hopper performance

> Remember to take backup frequently 

## Download

You can download the latest build of Pearl at [Release](https://github.com/Pearl-Project/Pearl/releases), you will get a Paperclip jar file. Once you downloaded it, just run it like normal way.

Pearl is recommended to use with Aikar Flags, you can use [this website](https://blog.airplane.gg/aikar-flags/) to generate it for your server

After startup, a new file called `purpur.yml` will be created, this is the configuration file for Purpur. You can take a look here for more details [Purpur Documentation](https://purpurmc.org/docs/)

## Notes

In order to change redstone algorithm, go to `paper.yml` and find `redstone-algo`. You can set it to one of these value

* `vanilla:` Vanilla default algorithm
* `eigencraft:` Eigencraft algorithm
* `alternate-current:` [Alternate Current](https://github.com/SpaceWalkerRS/alternate-current) algorithm (recommended)

## Building and setting up
**Initial setup**
```bash
git clone https://github.com/Pearl-Project/Pearl.git
./gradlew applyPatches
```

**Creating a patch**

See [Purpur CONTRIBUTING.md](https://github.com/PurpurMC/Purpur/blob/ver/1.18.2/CONTRIBUTING.md)

**Compiling and Building**

Use the command `./gradlew build` to build the API and server. Compiled JARs
will be placed under `Pearl-API/build/libs` and `Pearl-Server/build/libs`.

To get a pearlclip jar, run `./gradlew createReobfPaperclipJar`.
To install the `pearl-api` and `pearl` dependencies to your local Maven repo, run `./gradlew publishToMavenLocal`

## Credit

Pearl has patches from the following fork:

* [JettPack](https://gitlab.com/Titaniumtown/JettPack)
* [Patina](https://github.com/PatinaMC/Patina)
* [Akarin](https://github.com/Akarin-project/Akarin)
* [EMC](https://github.com/starlis/empirecraft)
* [Slice](https://github.com/Cryptite/Slice)

Upstream: [Purpur](https://github.com/PurpurMC/Purpur)

<a href="https://www.flaticon.com/free-icons/pearl" title="pearl icons">Pearl icons created by Freepik - Flaticon</a>
