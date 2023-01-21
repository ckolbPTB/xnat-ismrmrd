# MRD
Xnat schema for ISMRMRD data format.

In order to create the plugin clone the repository:
```
git clone https://github.com/ckolbPTB/xnat-ismrmrd.git
cd xnat-ismrmrd
```
and then use gradlew to build the plugin
```
./gradlew init
./gradlew clean xnatPluginJar
```

If you want to rebuild the plugin after making some changes to the code
it is a good idea to ensure there are no more running gradlew clients:
```
./gradlew --stop
```
before building again with
```
./gradlew clean xnatPluginJar
```
