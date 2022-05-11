# live-coding-task

### Prerequisities
- Java 8+
- Maven ([Install docs](https://maven.apache.org/install.html))
- IDE (IntelliJ Idea, Eclipse etc.)
- GIT ([Install docs](https://git-scm.com/downloads))

### Tech stack:
- Java 8
- Maven
- Selenide (Will be installed automatically)
- JUnit (Will be installed automatically)
- Please see pom.xml file for more details on application modules

### Supports Browsers
- Chrome (latest version)
- Firefox (latest version)

### How to run with Maven

Type from command line for running tests in different browsers:

```
mvn clean test -P chrome
mvn clean test -P firefox
```

### Assumptions
- You already familiar with: Git, Java, Terminal/Command line implementation of your Operation System
- Application code will be located in (Unix): ```~/Projects``` or in (Windows) ```C:\Projects```

Use this command to download code base
```bash
cd PROJECT_DIR
git clone https://github.com/anplay/live-coding-task.git
```

Open terminal (Unix) or CMD prompt (MS Windows) and run following commands:
```bash
cd PROJECT_DIR
git pull
```