@echo off
setlocal

rem This script is a wrapper for sbt (Simple Build Tool) that lets developers run sbt without prior installation.
rem It downloads the sbt-launch jar if it doesn't already exist, and then runs sbt with the provided arguments.

rem Configuration
set SBT_DIR=.sbt
set SBT_LAUNCHER_URL_BASE=https://repo1.maven.org/maven2/org/scala-sbt/sbt-launch

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

rem Run sbt with the provided arguments
java -jar "%SBT_LAUNCHER_JAR%" %*