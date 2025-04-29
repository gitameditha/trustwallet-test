# Sample Mobile Framework

This is a mobile automation testing framework built using **Java**, **Appium**, and **TestNG**. The framework is designed to be modular, scalable, and easy to maintain, with support for dynamic locators and reusable components.

---

## Features

- **Appium Integration**: Automates mobile applications on Android and iOS.
- **TestNG Support**: Provides test execution and reporting.
- **Dynamic Locator Management**: Uses `.properties` files to manage locators for different contexts or products.
- **Page Object Model (POM)**: Implements POM to separate test logic from UI interactions.
- **Reusable Utilities**: Includes utilities for driver management, locator handling, and more.
- **Cross-Platform Support**: Can be extended to support both Android and iOS.

---

## Project Structure

.
├── README.md
├── latest.apk
├── pom.xml
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── pages
│   │   │   │   ├── BasePage.java
│   │   │   │   └── SamplePage.java
│   │   │   └── utils
│   │   │       ├── DriverUtils.java
│   │   │       └── LocatorUtils.java
│   │   └── resources
│   │       └── homepages.locator.properties
│   ├── test
│   │   └── java
│   │       └── tests
│   │           ├── BaseTest.java
│   │           └── SampleTest.java
│   └── testng.xml
└── target
    ├── classes
    │   ├── homepages.locator.properties
    │   ├── pages
    │   │   ├── BasePage.class
    │   │   └── SamplePage.class
    │   └── utils
    │       ├── DriverUtils.class
    │       └── LocatorUtils.class
    ├── generated-sources
    │   └── annotations
    ├── generated-test-sources
    │   └── test-annotations
    ├── maven-status
    │   └── maven-compiler-plugin
    │       ├── compile
    │       │   └── default-compile
    │       │       ├── createdFiles.lst
    │       │       └── inputFiles.lst
    │       └── testCompile
    │           └── default-testCompile
    │               ├── createdFiles.lst
    │               └── inputFiles.lst
    ├── surefire-reports
    │   ├── SampleMobileAutomation
    │   │   ├── Test.html
    │   │   ├── Test.xml
    │   │   └── testng-failed.xml
    │   ├── TEST-TestSuite.xml
    │   ├── TestSuite.txt
    │   ├── bullet_point.png
    │   ├── collapseall.gif
    │   ├── emailable-report.html
    │   ├── failed.png
    │   ├── index.html
    │   ├── jquery-3.6.0.min.js
    │   ├── junitreports
    │   │   └── TEST-tests.SampleTest.xml
    │   ├── navigator-bullet.png
    │   ├── old
    │   │   ├── SampleMobileAutomation
    │   │   │   ├── Test.properties
    │   │   │   ├── classes.html
    │   │   │   ├── groups.html
    │   │   │   ├── index.html
    │   │   │   ├── main.html
    │   │   │   ├── methods-alphabetical.html
    │   │   │   ├── methods-not-run.html
    │   │   │   ├── methods.html
    │   │   │   ├── reporter-output.html
    │   │   │   ├── testng.xml.html
    │   │   │   └── toc.html
    │   │   └── index.html
    │   ├── passed.png
    │   ├── skipped.png
    │   ├── testng-failed.xml
    │   ├── testng-reports.css
    │   ├── testng-reports.js
    │   ├── testng-reports1.css
    │   ├── testng-reports2.js
    │   ├── testng-results.xml
    │   └── testng.css
    └── test-classes
        └── tests
            ├── BaseTest.class
            └── SampleTest.class
            
## Prerequisites

1. **Java**: Install Java 11 or higher.
2. **Maven**: Install Maven for dependency management.
3. **Appium**: Install Appium globally using npm:
   ```bash
   npm install -g appium
4. Android Emulator or Real Device: Ensure you have an Android emulator or a connected real device.
5. Appium Server: Start the Appium server before running tests: 
`appium`

## Setup
1. Clone the repository:
``` 
git clone <repository-url>
cd sample-mobile-framework
```
2. Install dependencies:
```
mvn clean install
```
3. Update the src/main/resources/homepages.locator.properties file with the correct locators for your application.

4. Configure the desired capabilities in DriverUtils.java:
```
capabilities.setCapability("platformName", "Android");
capabilities.setCapability("deviceName", "emulator-5554");
capabilities.setCapability("app", System.getProperty("user.dir") + "/latest.apk");
```
## Running Tests
1. Run all tests using Maven:
```
mvn test
```
2. Run a specific test class:
```
mvn -Dtest=SampleTest test
```
3. View the TestNG report: After the tests complete, open the TestNG report located at:
```
[index.html](http://_vscodecontentref_/2)
```
## Key Files
- homepages.locator.properties: Contains locators for UI elements.
- SampleTest.java: Example test case demonstrating dynamic PIN input.
- DriverUtils.java: Utility class for driver initialization and element interactions.

## Technologies Used
Java
Appium
TestNG
Maven