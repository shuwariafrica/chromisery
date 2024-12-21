# Chromisery

Chromisery is a community-driven fork of Chromis, built because the original project doesn't currently accept
contributions or provide its source code as required by its GPLv3 license. Chromisery uses the latest available Chromis
source (git rev 5a4a517) and aims to be a truly open-source alternative, ready to contribute back upstream in the spirit
of open source when the original project is open to collaboration.

## Project Focus

The current focus of Chromisery is to work on tooling and workflow, streamlining the build and testing process,
and the release process before working on features and fixes.

## Current State

**Work in Progress**: Chromisery is currently in a work-in-progress state and is not fit for production use. It is
likely to have issues and is under active development. We welcome contributions and feedback from the community to help
improve the project.

## Sponsorship

This work is sponsored by [Kokkos Cafe Ltd](https://kokkoscafe.com).

## Build and Testing

### Project Structure

Chromisery follows a typical sbt project structure:

- `build.sbt`: The main build file containing project settings and dependencies.
- `project/`: Directory containing sbt configuration files and plugins.
- `modules/chromisery-pos/`: Main module for the Chromisery POS application.
    - `src/main/java/`: Java source files.
    - `src/main/resources/`: Resource files.
    - `src/test/java/`: Java test files.
    - `src/test/resources/`: Test resource files.
- _etc._

### Prerequisites

- Java Development Kit - [Download Adoptium JDK](https://adoptium.net/releases.html)
- SBT (Simple Build Tool) - [Download SBT](https://www.scala-sbt.org/download.html)

### Building the Project

To build the project, execute the following command in the project root directory to compile all project modules:

```sh
sbt compile
```

### Running the Project

To run the POS module, execute the following command in the project root directory:

```sh
sbt chromisery-pos/run
```

### Importing the Project

The project can be imported for development and compilation by any IDE that supports sbt, for example:

#### IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Select **File** > **New** > **Project from Version Control...**.
3. Enter the repository URL: `git@github.com:shuwariafrica/chromisery.git`.
4. IntelliJ IDEA will clone the repository and automatically detect the `build.sbt` file, prompting you to import the
   project.

#### Visual Studio Code

1. Open Visual Studio Code.
2. Open the **Source Control** view.
3. Click **Clone Repository**.
4. Enter the repository URL: `git@github.com:shuwariafrica/chromisery.git`.
5. Open the cloned repository in VS Code.
6. The **Scala (Metals)** extension will detect the `build.sbt` file and prompt you to import the project. Click *
   *Import build**.

## Acknowledgments

We would like to acknowledge the authors and contributors of the following projects, which have laid the foundation for
Chromisery:

- **ChromisPOS**: The original project from which Chromisery is forked.
- **UniCenta**: The project from which ChromisPOS was derived.
- **OpenBravo**: The project from which UniCenta was derived.

Their work and dedication have made this project possible.

## License

    This program is free software: you can redistribute it and/or modify it under
    the terms of the GNU General Public License as published by the Free Software
    Foundation, either version 3 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful, but WITHOUT ANY
    WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A
    PARTICULAR PURPOSE. See the GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along with this
    program. If not, see https://www.gnu.org/licenses/gpl-3.0.en.html.

## Contributing

We welcome contributions from the community. Please fork the repository and submit pull requests.
