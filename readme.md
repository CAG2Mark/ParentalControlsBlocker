# ParentalControlsBlocker
Fixes the lag spikes in-game due to the Minecraft parental controls. This does **not** affect the client-side hidden players feature, but it *will disable the Microsoft Account based player blocking*.

Thanks to https://github.com/traksag for identifying the cause of the issue and providing useful information on which methods to override.

# Building
```bash
git clone https://github.com/CAG2Mark/ParentalControlsBlocker
cd ParentalControlsBlocker
./gradlew build
```
