# TVSFIT Automation Framework

## Overview

This project is a Selenium Test Automation Framework developed for automating the TVSFIT web application. The framework follows the Page Object Model (POM) design pattern and is built using Java, Selenium WebDriver, TestNG, and Maven.

## Tech Stack

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)
* Git & GitHub

## Project Structure

```text
src
 └── test
     └── java
         ├── pages
         │   ├── LoginPage.java
         │   ├── CreateOrderPage.java
         │   └── ChangeStatusPage.java
         │
         ├── tests
         │   └── TVSFITTest.java
         │
         └── utils
             └── BaseClass.java

pom.xml
testng.xml
```

## Framework Features

* Page Object Model (POM)
* Reusable Base Class
* Explicit Wait Implementation
* Cross-page Navigation Handling
* TestNG Test Execution
* Maven Dependency Management
* Git Version Control

## Test Flow

1. Launch Application
2. Login to TVSFIT Application
3. Create New Order
4. Update/Change Order Status
5. Validate Successful Completion
6. Logout and Close Browser

## Prerequisites

* Java JDK 8 or above
* Maven
* Eclipse IDE
* Google Chrome Browser
* ChromeDriver (compatible version)

## Installation

Clone the repository:

```bash
git clone https://github.com/arunponshanker/selenium-automation-project.git
```

Navigate to the project folder:

```bash
cd selenium-automation-project
```

Install dependencies:

```bash
mvn clean install
```

## Running the Tests

Using Maven:

```bash
mvn test
```

Using TestNG:

* Open `testng.xml`
* Right Click → Run As → TestNG Suite

## Design Pattern Used

### Page Object Model (POM)

The framework separates page elements and actions from test scripts, making the code reusable, maintainable, and scalable.


```
```
