@echo off
setlocal

rem This script is a wrapper for sbt (Simple Build Tool) that lets developers run sbt without prior installation.
rem It downloads the sbt-launch jar and script if they don't already exist, and then runs sbt with the provided arguments.

rem Configuration
set SBT_DIR=.sbt
set SBT_LAUNCHER_URL_BASE=https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch
set SBT_SCRIPT_URL_BASE=https://raw.githubusercontent.com/sbt/sbt

rem Ensure the build.properties file exists
if not exist "project\build.properties" (
  echo Error: project\build.properties file not found.
  exit /b 1
)

rem Read the sbt version from the project's build.properties file
set SBT_VERSION=
for /f "tokens=2 delims==" %%i in ('findstr /r "^\s*sbt.version\s*=\s*" project\build.properties') do set SBT_VERSION=%%i

rem Check if the sbt.version property was found
if "%SBT_VERSION%"=="" (
  echo Error: sbt.version property not found in project\build.properties.
  exit /b 1
)

rem Remove leading and trailing spaces from the version string
set SBT_VERSION=%SBT_VERSION: =%

rem Check if the sbt-launch jar for the specified version exists
set SBT_LAUNCHER_JAR=%SBT_DIR%\sbt-launch-%SBT_VERSION%.jar
if not exist "%SBT_LAUNCHER_JAR%" (
  echo Downloading sbt-launch-%SBT_VERSION%.jar...
  mkdir "%SBT_DIR%"
  rem Download the sbt-launch jar file
  powershell -Command "Invoke-WebRequest -Uri %SBT_LAUNCHER_URL_BASE%/%SBT_VERSION%/sbt-launch-%SBT_VERSION%.jar -OutFile %SBT_LAUNCHER_JAR%"
  if %ERRORLEVEL% neq 0 (
    echo Error: Failed to download sbt-launch-%SBT_VERSION%.jar
    exit /b 1
  )
)

rem Check if the sbt script exists
set SBT_SCRIPT=%SBT_DIR%\sbt.bat
if not exist "%SBT_SCRIPT%" (
  echo Downloading sbt script...
  rem Construct the URL for the sbt script corresponding to the sbt version
  set SBT_SCRIPT_URL=%SBT_SCRIPT_URL_BASE%/v%SBT_VERSION%/sbt.bat
  rem Download the sbt script file
  powershell -Command "Invoke-WebRequest -Uri %SBT_SCRIPT_URL% -OutFile %SBT_SCRIPT%"
  if %ERRORLEVEL% neq 0 (
    echo Error: Failed to download sbt script
    exit /b 1
  )
)

rem Delegate to the fetched sbt script with the --sbt-jar option
call "%SBT_SCRIPT%" --sbt-jar "%SBT_LAUNCHER_JAR%" %*
