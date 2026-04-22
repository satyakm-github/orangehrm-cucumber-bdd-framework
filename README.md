# OrangeHRM Cucumber BDD Framework

## Overview

This repository contains a scalable test automation framework for the OrangeHRM application, built using Cucumber BDD and Selenium WebDriver. The framework is designed following Behavior Driven Development (BDD) principles, enabling clear collaboration between technical and non-technical stakeholders through Gherkin-based test scenarios.

The objective of this project is to deliver a maintainable, reusable, and business-readable automation solution that ensures efficient validation of end-to-end application workflows while following industry-standard test automation practices.

---

## 🧰 Tech Stack

* Java
* Selenium WebDriver
* Cucumber (BDD)
* TestNG / JUnit (based on implementation)
* Maven
* Page Object Model (POM)

---

## 📂 Project Structure

```
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com.keerthi.orangehrm.components
│   │   │   ├── com.keerthi.orangehrm.driver
│   │   │   ├── com.keerthi.orangehrm.pages
│   │   │   ├── com.keerthi.orangehrm.utils
│   │   │   │   └── ConfigReader.java
│   │   │   └── context
│   │   │       └── TestContext.java
│   │   └── resources
│   │
│   ├── test
│   │   ├── java
│   │   │   ├── com.keerthi.orangehrm.hooks
│   │   │   ├── com.keerthi.orangehrm.runners
│   │   │   └── com.keerthi.orangehrm.stepdefinitions
│   │   └── resources
│   │       ├── features
│   │       │   ├── employee.feature
│   │       │   ├── login.feature
│   │       │   └── navigation.feature
│   │       └── files
│   │           ├── car.png
│   │           └── config.properties
│
├── target
│   ├── htmlreports
│   ├── jsonreports
│   └── test-output
│
├── pom.xml
├── LICENSE
└── README.md
```
---

## ✅ Test Scenarios Covered

The following functional test scenarios are automated in this framework:

1. Valid login with Admin credentials → Dashboard is successfully displayed
2. Invalid login attempts (wrong password) → "Invalid credentials" message is shown (4 test cases covered)
3. Empty username and password validation → Required field validation messages are displayed
4. Dashboard validation → Key widgets and cards are visible on successful login
5. Left navigation menu validation → Modules like Admin, PIM, Leave are visible and clickable
6. Menu search functionality → Search returns matching modules (covered searching for 4 modules and click on each to validate user is viewing selected module)
7. PIM module access → Employee List page is displayed successfully
8. Add Employee functionality → Employee is created with First & Last name and redirected to Personal Details page
9. Verify Employee creation → Newly added employee appears in Employee List search results
10. Edit Employee functionality → Existing employee details can be updated successfully

---

## ⚙️ Installation & Setup

### 1️⃣ Prerequisites

* Java JDK 8 or higher
* Maven installed
* Chrome / Edge browser
* Git

### 2️⃣ Steps

1. Clone the repository:

```bash
git clone https://github.com/satyakm-github/orangehrm-cucumber-bdd-framework.git
```

2. Navigate to project directory:

```bash
cd orangehrm-cucumber-bdd-framework
```

3. Install dependencies:

```bash
mvn clean install
```

4. Run tests:

```bash
mvn test
```

---

## 🚀 Running Tests

### Using Test Runner

Execute the test runner class located in:

```
src/test/java/runners
```

### Using Maven

```bash
mvn test
```

---

## 📊 Reporting

After execution, test reports are generated in:

```
target/htmlreports
target/jsonreports
test-output
```


---

## ⚙️ Configuration

Update configuration files in:

```
src/test/resources/config
```

You can modify:

* 🌍 Browser type
* 🌐 Application URL

---

## 🧠 Design Approach

This framework follows:

* Page Object Model (POM)
* Cucumber BDD (Gherkin syntax)
* Centralized driver management
* Modular and reusable components


---

## 🌐 Application Under Test

- URL: https://opensource-demo.orangehrmlive.com/

---

## 🚀 Future Enhancements

✔ Expand UI coverage with advanced scenarios (file upload, filters, reset flows, role-based validations)

✔ Build a dedicated API automation framework using REST Assured with Java for backend validation (CRUD, authentication, schema checks)

✔ Develop a separate Playwright-based UI automation project using JavaScript/TypeScript for modern cross-browser testing experience
