# design-pattern
Exemples d'implémentation des Design Patterns en Java.

# Mise en place
## Prérequis
* [Java 11](https://adoptium.net/?variant=openjdk11&jvmVariant=hotspot)
* [Visual Studio Code](https://code.visualstudio.com/download)

## Récupération des sources
* Aller dans un répertoire de travail
* Ouvrez un bash et lancez les commandes suivantes
```bash
git clone https://github.com/jandry/design-pattern.git
cd design-pattern
code .
```

## Configuration à la première ouverture avec VSCode
* Une fois VSCode ouvert installez les extensions suivantes:
  * Pour Java
    *
    * [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
    * [Java IDE](https://marketplace.visualstudio.com/items?itemName=YouMayCallMeV.vscode-java-saber)
  * Pour build Gradle
    * [Gradle Extension Pack](https://marketplace.visualstudio.com/items?itemName=richardwillis.vscode-gradle-extension-pack)
  * Pour diagram UML
    * [PlantUML](https://marketplace.visualstudio.com/items?itemName=jebbs.plantuml)
    * [Markdown Preview Enhanced](https://marketplace.visualstudio.com/items?itemName=shd101wyy.markdown-preview-enhanced)
* Contenu minimum recommandé pour `settings.json`
```
{
    "files.exclude": {
        "**/.classpath": true,
        "**/.project": true,
        "**/.settings": true,
        "**/.factorypath": true
    },
    "editor.suggestSelection": "first",
    "vsintellicode.modify.editor.suggestSelection": "automaticallyOverrodeDefaultValue",
    "java.home": "C:\\Program Files\\Java\\jdk-11.0.12",
    "terminal.integrated.defaultProfile.windows": "Git Bash",
    "files.autoSave": "afterDelay",
}
```
* Contenu minimum recommandé pour `.bashrc`
```
export TERM=cygwin
export JAVA_HOME="/c/Program Files/Java/jdk-11.0.12"
export PATH=$JAVA_HOME/bin:$PATH
echo $JAVA_HOME
```

## Build & test
Dans un bash tapez
```bash
./gradlew test
```
