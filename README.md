# Chromisery

Chromisery is a community-driven fork of Chromis, built because the original project does not currently accept
contributions, nor provide its source code as required by its GPLv3 licence. Chromisery uses the latest available
Chromis source (git rev 5a4a517) and aims to be a truly open-source alternative, ready to contribute back upstream in
the spirit of open source when the original project is open to collaboration.

## Table of Contents

- [Project Focus](#project-focus)
- [Current State](#current-state)
- [Build and Testing](#build-and-testing)
    - [Prerequisites](#prerequisites)
    - [Building the Project](#building-the-project)
        - [Building with SBT](#building-with-sbt)
            - [Using SBT Interactive Shell](#using-sbt-interactive-shell)
            - [Executing Commands Directly](#executing-commands-directly)
        - [Building with IDEs](#building-with-ides)
            - [IntelliJ IDEA](#intellij-idea)
            - [Visual Studio Code](#visual-studio-code)
            - [NetBeans (chromisery-pos Module Only)](#netbeans-chromisery-pos-module-only)
    - [Project Structure](#project-structure)
- [Acknowledgments](#acknowledgments)
- [Sponsorship](#sponsorship)
- [Contributing](#contributing)
- [Licence](#licence)

## Project Focus

The current focus of Chromisery is to work on tooling and workflow, streamlining the build and testing process, and the
release process before working on features and fixes.

## Current State

**Work in Progress**: Chromisery is currently in a work-in-progress state and is not fit for production use. It is
likely to have issues and is under active development. Contributions and feedback from the community are welcome to help
improve the project.

## Build and Testing

### Prerequisites

- Java Development Kit - [Download Adoptium JDK](https://adoptium.net/releases.html)
- sbt (Simple Build Tool) - [Download sbt](https://www.scala-sbt.org/download.html) **(optional)**

Whilst Chromisery is built and packaged by [sbt](https://www.scala-sbt.org/), sbt does not have to be installed in order
to work on this project. Wrapper scripts (`sbtw` and `sbtw.bat`) are provided that will download and use the appropriate
version of SBT as required.

### Building the Project

The project can be built and executed using sbt directly, or via built-in support in an IDE such as IntelliJ IDEA or
Visual Studio Code.

#### Building with SBT

Any SBT command can be executed either within the SBT interactive shell, or individually from your Operating System
shell.

##### Using SBT Interactive Shell

The SBT shell provides an interactive environment for running SBT commands. To start the SBT shell, execute one of the
following commands in the project root directory:

For those with SBT pre-installed:

```sh
sbt
```

For those using the provided wrapper scripts:

```sh
./sbtw  # Linux based systems wrapper script
```

```sh
sbtw.bat  # Windows systems wrapper script
```

Once in the SBT shell, you can run various commands. Here are some basic commands:

- `clean`: Cleans all generated files (e.g., compiled classes).
- `compile`: Compiles the source code of all projects.
- `run`: Compiles all projects and runs executes the main class of each (if specified in the build definition).
- `test`: Runs the tests of all projects.

You can also prefix any command with a tilde (`~`) to enable continuous recompilation and re-execution on source or
resource changes. For example:

```sh
~compile
```

This command will continuously monitor the source tree and recompile the project when changes are detected.

Additionally, you may also provide a specific project or module to run the command on. For example:

```sh
~chromisery-pos/run # Compile and run the chromisery-pos module and recompile/re-run on any changes
````

##### Executing Commands Directly

Alternatively, you can run any specific task or command directly from your Operating System shell without entering the
SBT
interactive shell. For example:

with SBT pre-installed

```sh
sbt ~chromisery-pos/run
````

*or*

```sh
./sbtw ~chromisery-pos/run  # Linux based systems wrapper script 
```

```sh
sbtw.bat ~chromisery-pos/run  # Windows systems wrapper script
```

For more detailed usage information, refer to
the [SBT documentation](https://www.scala-sbt.org/1.x/docs/Command-Line-Reference.html).

### Building with IDEs

The project can be imported for development and compilation by any IDE that supports sbt, for example:

#### IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Ensure the Scala plugin is installed and up to date:
    - Go to **File** > **Settings** > **Plugins**.
    - Search for "Scala" and click **Install** if it is not already installed.
    - Restart IntelliJ IDEA if required.
3. Select **File** > **New** > **Project from Version Control...**.
4. Enter the repository URL: `git@github.com:shuwariafrica/chromisery.git`.
5. IntelliJ IDEA will clone the repository and automatically detect the `build.sbt` file, prompting you to import the
   project.

#### Visual Studio Code

1. Open Visual Studio Code.
2. Ensure the Scala (Metals) extension is installed and up to date:
    - Go to **View** > **Extensions**.
    - Search for "Scala (Metals)" and click **Install** if it is not already installed.
    - Restart Visual Studio Code if required.
3. Open the **Source Control** view.
4. Click **Clone Repository**.
5. Enter the repository URL: `git@github.com:shuwariafrica/chromisery.git`.
6. Open the cloned repository in VS Code.
7. The **Scala (Metals)** extension will detect the `build.sbt` file and prompt you to import the project. Click *
   *Import build**.

#### NetBeans (`chromisery-pos` Module Only)

The `chromisery-pos` module can be imported into NetBeans to allow editing of `*.form` files using the GUI editor. The
instructions below assume that the project is already set up and the `chromisery-pos` module has been compiled. From the
project root:

1. Execute `sbt netbeans` or `./sbtw netbeans` (Unix-based systems) or `sbtw.bat netbeans` (Windows).
2. Open NetBeans.
3. Select **File** > **Open Project...**
4. Navigate to, and select the `chromisery-pos` module directory.

### Project Structure

Chromisery follows a typical Java project structure:

- `build.sbt`: The main build file containing project definitions.
- `project/`: Directory containing sbt configuration files and plugins.
- `modules/chromisery-pos/`: Main module for the Chromisery POS application.
    - `src/main/java/`: Java source files.
    - `src/main/resources/`: Resource files.
    - `src/test/java/`: Java test files.
    - `src/test/resources/`: Test resource files.
- _etc._

## Acknowledgments

The authors and contributors of the following projects are acknowledged, as they have laid the foundation for
Chromisery:

- **ChromisPOS**: The original project from which Chromisery is forked.
- **UniCenta**: The project from which ChromisPOS was derived.
- **OpenBravo**: The project from which UniCenta was derived.

Their work and dedication have made this project possible.

## Sponsorship

This work is sponsored by [Kokkos Cafe Ltd](https://kokkoscafe.com).

## Contributing

Contributions from the community are welcome. Please fork the repository and submit pull requests. For major changes,
and/or feature requests, feel free to open an issue for discussion.

## Licence

This software is released under the terms of the GPLv3 (GNU General Public Licence, Version 3). It is free software: you
can redistribute it and/or modify it under the terms of the GNU General Public Licence as published by the Free Software
Foundation, either version 3 of the Licence, or (at your option) any later version. This program is distributed in the
hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
FOR A PARTICULAR PURPOSE. See the GNU General Public Licence for more details. You should have received a copy of the
GNU General Public Licence along with this program. If not, see https://www.gnu.org/licenses/gpl-3.0.en.html.
