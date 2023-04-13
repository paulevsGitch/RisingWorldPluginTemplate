# Rising World Plugin Template
A simple template for making Rising World plugins.

**How to use:**
1. You need [JDK 20](https://jdk.java.net/20/) since Rising World uses same Java version for plugins.
2. You need installed Rising World (Steam Version)
3. Clone this repo (with `git clone` or with downloading as .zip).
4. Change `pathToRisingWorld` variable in `build.gradle` to your Rising World root path (Unity version)
5. Change `group` variable in `build.gradle` if necessary, it should be equal to your main package name.
6. In `settings.gradle` change the name to your project label.
7. Edit `plugin.yml` and add your credits. You can change main class path (don't forget to create/move main class if you will do this)
8. Import project into your favourite IDE (IntelliJ Idea, Eclipse, Netbeans, etc.) and start making code