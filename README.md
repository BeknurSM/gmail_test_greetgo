# Gmail Testing
***

## Table of Contents
    1. General Info
    2. Technologies
    3. Installation
    4. How to use


### General Info
***
Automation Testing is a software testing technique that performs using special automated testing software tools to execute a test case suite.
The purpose of this project is to test the UI of the site [gmail.com](https://www.gmail.com).

## Technologies
***
A list of technologies used within the project:
* Java: Version 17
* TestNG: Version 7.7.1
* Selenium: Version 4.8.1.0
* Maven: Version 3.8.6

## Installation
***
```bash
git clone https://github.com/BeknurSM/gmail_test_greetgo.git
```

## How to use
***
First, specify the user credentials in the config.properties file
Then do one of the following steps:

- Right-click the GmailSteps class and click run button to start the test.
- Right-click the gmail.xml file and click run button to start the test.
- Run using command line
```bash
mvn -Dsurfire.suiteXmlFile=src\test\resources\gmail-test.xml clean test
```