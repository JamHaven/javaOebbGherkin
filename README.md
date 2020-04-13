# javaOebbGherkin

# Architektur
Das von uns umgesetzte Test-Framework wurde mit der Programmiersprache Java entwickelt
und setzt auf Cucumber ( https://cucumber.io ) auf. Cucumber ist selbst ein Framework und
ermöglicht ein Behavior Driven Development (BDD). BDD ist ein Vorgehensmodell in
der Softwareentwicklung, in dem die funktionale und formale Spezifikation noch vor
der Entwicklung ausgearbeitet und festgelegt wird. 


# Installation und HowTo
## MacOs
1. Terminal öffnen
a. Homebrew installieren mit /bin/bash -c "$(curl -fsSL
https://raw.githubusercontent.com/Homebrew/install/master/install.sh )
b. Node.js installieren mittels brew install node
c. Checken ob node installiert mit mittels:
i. node -v
ii. npm -v
2. Android Studio
a. Android Studio installieren falls nicht vorhanden
b. Android sdk nachinstallieren falls nicht vorhanden
c. brew cask install android-sdk
2
Software Testing Framework SDE21 SWT FH Campus Wien
d. .bashrc oder .zshrc folgende Zeile hinzufügen:
i. export ANDROID_HOME=/path/to/android-sdk
e. Android Emulator starten und gegebenenfalls Android Gerät + Version auswählen
f. Danach oebbMobileApp.apk in Emulator ziehen (es wird automatisch installiert)
3. Appium installieren
a. Appium herunterladen und öffnen
i. https://github.com/appium/appium-desktop/releases/tag/v1.15.1
b. Server mit Standard IP + Standard Port starten
4. IntelliJ
a. IntelliJ starten
b. Runner.class ausführen mit “Run”
Anmerkung : Im Normalfall sollte der Appium Server Logs sammeln und die ÖBB-App im
Emulator ausgeführt werden. In IntelliJ sollten die Tests ausgeführt werden und ausgegeben
ob der Test erfolgreich/nicht erfolgreich war.

## Windows
Appium installieren mittels Nodejs (cmd)
1. Nodejs
a. Nodejs downloaden und installieren:
i. https://nodejs.org/en/download/
b. Checken ob Nodejs installiert ist mittels command prompt:
i. node --version
ii. npm --version
iii. which node
iv. which npm
2. Appium installieren & starten mittels nodejs (cmd)
a. npm install -g appium
b. appium
Appium installieren als Desktop Client (cmd)
1. Appium herunterladen und installieren
a. https://github.com/appium/appium-desktop/releases/tag/v1.15.1
2. Appium ausführen
a. Server mit Standard IP + Standard Port starten
3. Android Studio
a. Android Studio installieren falls nicht vorhanden
b. Android sdk nachinstallieren falls nicht vorhanden
3
Software Testing Framework SDE21 SWT FH Campus Wien
c. Android Emulator starten und gegebenenfalls Android Gerät + Version
auswählen
d. Danach oebbMobileApp.apk in Emulator ziehen (es wird automatisch
installiert)
4. IntelliJ
a. IntelliJ installieren falls nicht vorhanden
b. Runner.class ausführen mit “Run”
Anmerkung : Wenn alle Schritte erfolgreich umgesetzt wurden, sollte im Normalfall der
Appium Server Logs sammeln und die ÖBB-App im Emulator ausgeführt werden. In IntelliJ
sollten die Tests ausgeführt werden und ausgegeben ob der Test erfolgreich/nicht
erfolgreich war.

# Testdevice
{
"platformName": "Android",
"deviceName": "Pixel 2 API 29",
"app": "<PathToApk>\\oebbMobileApp.apk",
"automationName": "UiAutomator1",
"autoGrantPermissions": "true"
}
