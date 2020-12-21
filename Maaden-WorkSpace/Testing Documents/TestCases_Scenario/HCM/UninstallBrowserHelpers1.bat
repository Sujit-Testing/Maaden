@echo off
rem Uninstall IE BHO and FireFox extensions manually.
set InstallDir=%~dp0
set oldDir=%CD%
cd /d "%InstallDir%"
set JavaCmd=%CD%\jre\bin\java.exe
rem -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=y,address=5010
rem Three parameters can be appended orderly after "BrowserHelpersInstaller.jar": 
rem 1. Installation Directory of OpenScript. If not set, it is set to a default one, 'C:\OracleATS\OpenScript\'.
rem 2. Type of action "install"/"uninstall". "install" is default. 
rem 3. Type of Browser:
rem    1)"IE" - install/uninstall IE helper only
rem    2)"FF" - install/uninstall FF add-on only
rem    3)"both" - work with both browsers, and it is a default option.
"%JavaCmd%" -jar "%CD%\BrowserHelpersInstaller.jar" "%CD%" uninstall
cd /d "%oldDir%"

