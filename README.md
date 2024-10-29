# Guide to Set Up Java 21 and IntelliJ IDEA (Community Edition) on Windows and macOS

## 1. Setting up Java 21 (JDK 21)

### Windows

1. **Download JDK 21**:
    - Go to the official Oracle JDK download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html).
    - Download the JDK 21 installer for Windows.

2. **Install JDK 21**:
    - Run the installer and follow the installation steps.
    - By default, it installs to `C:\Program Files\Java\jdk-21`.

3. **Set Environment Variables**:
    - Right-click **This PC** or **My Computer**, select **Properties** > **Advanced system settings** > **Environment Variables**.
    - Edit the `Path` variable under **System Variables** and add:
      ```
      C:\Program Files\Java\jdk-21\bin
      ```

4. **Verify Installation**:
    - Open **Command Prompt** and run:
      ```bash
      java -version
      ```
    - The output should show Java 21 details.

### macOS

1. **Download JDK 21**:
    - Visit [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html) and download the `.dmg` installer for macOS.

2. **Install JDK 21**:
    - Open the `.dmg` file and follow the installation prompts.

3. **Set Environment Variables** (Optional):
    - Open **Terminal** and edit your profile:
      ```bash
      nano ~/.zshrc  # For Zsh users
      nano ~/.bash_profile  # For Bash users
      ```
    - Add:
      ```bash
      export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk-21.jdk/Contents/Home
      ```
    - Save and exit.

4. **Verify Installation**:
    - In **Terminal**, run:
      ```bash
      java -version
      ```
    - The output should show Java 21 details.

## 2. Installing IntelliJ IDEA Community Edition

### Windows

1. **Download IntelliJ IDEA**:
    - Visit [IntelliJ IDEA Downloads](https://www.jetbrains.com/idea/download/) and download the **Community Edition** installer for Windows.

2. **Install IntelliJ IDEA**:
    - Run the installer and follow the wizard. Create a desktop shortcut if you prefer.

3. **Launch IntelliJ IDEA**:
    - Open IntelliJ from the Start Menu or desktop shortcut.

4. **Set JDK 21**:
    - Go to **File** > **Project Structure** > **Project**, and set **Project SDK** to JDK 21.

### macOS

1. **Download IntelliJ IDEA**:
    - Visit [IntelliJ IDEA Downloads](https://www.jetbrains.com/idea/download/) and download the `.dmg` installer for macOS.

2. **Install IntelliJ IDEA**:
    - Drag IntelliJ IDEA into the **Applications** folder.

3. **Launch IntelliJ IDEA**:
    - Open **IntelliJ IDEA** from the **Applications** folder.

4. **Set JDK 21**:
    - Go to **File** > **Project Structure** > **Project**, and set **Project SDK** to JDK 21.

## 3. Verifying IntelliJ IDEA Setup with Java 21

1. **Create a New Project**:
    - Launch IntelliJ and create a new **Java** project, selecting JDK 21 as the SDK.

2. **Create a Sample Java Program**:
    - In the `src` folder, create a class `HelloWorld.java` with the following code:
      ```java
      public class HelloWorld {
          public static void main(String[] args) {
              System.out.println("Hello, Java 21!");
          }
      }
      ```

3. **Run the Program**:
    - Right-click the file and select **Run 'HelloWorld.main()'**. You should see:
      ```
      Hello, Java 21!
      ```

## 4. Cloning the `elevator` GitHub Repository

### Windows & macOS

1. **Install Git**:
    - Download and install Git from [Git's official website](https://git-scm.com/downloads).
    - For macOS, you can use Homebrew:
      ```bash
      brew install git
      ```

2. **Clone the Repository via IntelliJ IDEA**:
    - Open IntelliJ IDEA and select **Get from VCS** from the Welcome screen (or **File** > **New** > **Project from Version Control**).
    - Enter the repository URL:
      ```
      https://github.com/codebootuplee/elevator.git
      ```
    - Select a directory to clone the project.

3. **Clone the Repository**:
    - Click **Clone**, and IntelliJ will download the repository. When prompted, trust the project.

4. **Import Gradle Dependencies**:
    - The `elevator` project uses **Gradle** for dependency management.
    - IntelliJ should automatically detect the `build.gradle` file and start importing Gradle dependencies.
    - If IntelliJ doesn't automatically import, right-click the `build.gradle` file and select **Import Gradle Project**.

5. **Set JDK 21 for the Project**:
    - Ensure JDK 21 is set for the project by going to **File** > **Project Structure** > **Project** and selecting JDK 21 as the SDK.

6. **Run the Project**:
    - Right-click the main Spring Boot application class and choose **Run**. IntelliJ will build the project using Gradle and launch the Spring Boot application.

## Conclusion

Now you're set up with Java 21, IntelliJ IDEA, and the `elevator` project using Gradle. You're ready to start coding and exploring Spring Boot with Java 21!

# Common `gradlew` Commands for Java Projects

### 1. `./gradlew build`
- **Description**: Compiles the source code, runs tests, and packages the project into a JAR or WAR file.

### 2. `./gradlew clean`
- **Description**: Deletes the build directory, removing all the build outputs from the previous runs.

### 3. `./gradlew assemble`
- **Description**: Compiles the source code and creates the output artifacts (like JAR/WAR), but does not run the tests.

### 4. `./gradlew test`
- **Description**: Runs the unit tests in the project.

### 5. `./gradlew check`
- **Description**: Runs all quality checks like unit tests, static code analysis, and linting.

### 6. `./gradlew run`
- **Description**: Runs the project by executing the main class (requires the `application` plugin and a defined `mainClassName`).

### 7. `./gradlew dependencies`
- **Description**: Shows the list of dependencies that your project has, including their versions and transitive dependencies.

### 8. `./gradlew jar`
- **Description**: Compiles the project and packages the compiled code into a JAR file.

### 9. `./gradlew javadoc`
- **Description**: Generates the Javadoc for the project and places it in the `build/docs/javadoc` directory.

### 10. `./gradlew eclipse` / `./gradlew idea`
- **Description**: Generates project files for Eclipse or IntelliJ IDEA, respectively.

### 11. `./gradlew bootRun`
- **Description**: Runs a Spring Boot application (requires the `spring-boot` plugin).

### 12. `./gradlew bootJar`
- **Description**: Builds an executable JAR for a Spring Boot application, including all dependencies.

### 13. `./gradlew tasks`
- **Description**: Lists all the tasks available in the current project, including custom tasks defined in the build scripts.

### 14. `./gradlew --daemon`
- **Description**: Starts the Gradle Daemon to speed up subsequent builds.

### 15. `./gradlew --stop`
- **Description**: Stops any running Gradle Daemon processes.

### 16. `./gradlew init`
- **Description**: Initializes a new Gradle project with basic project files such as `build.gradle`.

### 17. `./gradlew wrapper`
- **Description**: Generates the Gradle Wrapper scripts (`gradlew` and `gradlew.bat`) for the project.

---

## Java Compilation Commands

### 18. `./gradlew compileJava`
- **Description**: Compiles the main source code of the project (`src/main/java`).

### 19. `./gradlew compileTestJava`
- **Description**: Compiles the test source code (`src/test/java`).

### 20. `./gradlew compileClasspath`
- **Description**: Resolves the dependencies needed for compiling the main source code.

### 21. `./gradlew compileTestClasspath`
- **Description**: Resolves the dependencies needed for compiling the test source code.

### 22. `./gradlew processResources`
- **Description**: Copies resources from `src/main/resources` to the build output directory.

### 23. `./gradlew processTestResources`
- **Description**: Copies resources from `src/test/resources` to the test output directory.
