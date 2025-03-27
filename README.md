# Toyota GPT UI Test

## Overview

Toyota GPT UI Test is an automated UI testing framework for Toyota's web application, built using
**Selenium,
Cucumber,
TestNG, and
Maven**.
It enables UI validation using behavior-driven development (BDD) and generates test reports.

## Technologies Used

- **Java 17**
- **Selenium WebDriver 4.29.0**
- **Cucumber 7.14.0**
- **JUnit 5.9.2**
- **WebDriverManager 5.7.0**
- **Maven for dependency management**

## Project Structure

```
toyota-gpt-ui-test/
│-- src/
│   ├── main/
│   │   ├── java/com/toyota/gpt/pages/        # Page Object Model classes
│   │   ├── java/com/toyota/gpt/utils/        # Utility classes
│   │   ├── resources/                        # Configuration files
│   ├── test/
│   │   ├── java/com/toyota/gpt/stepDefinitions/  # Step Definitions
│   │   ├── java/com/toyota/gpt/runners/         # Test Runner
│   │   ├── resources/features/                  # Feature Files
│-- pom.xml                                     # Maven dependencies
│-- README.md                                   # Project documentation
│-- reports/                                    # Test Reports
```

## Setup Instructions

### 1. Clone the repository

```bash
  git clone <repository-url>
cd toyota-gpt-ui-test
```

### 2. Install dependencies

Ensure Maven is installed, then run:

```bash
  mvn clean install
```

### 3. Run the tests

To execute Cucumber tests, use:

```bash
  mvn test
```

or specify a **tag** to run a specific test suite:

```bash
  mvn test -Dcucumber.filter.tags="@Positive"
```

### 4. View Reports

After execution, reports are available in:

```
target/surefire-reports/
target/cucumber-reports/
```

## Authentication Handling

If your tests require authentication:

1. Ensure you have a valid **authorization token**.
2. Use **environment variables** or update `ConfigReader.java` to manage credentials securely.

## Continuous Integration (CI)

You can integrate this framework with **Jenkins, GitHub Actions, or Azure DevOps** by running:

```bash
  mvn test
```

in your CI/CD pipeline configuration.

## Contribution Guidelines

1. Fork the repository.
2. Create a new branch for your feature/bugfix:
   ```bash
   git checkout -b feature-new-test
   ```
3. Commit your changes:
   ```bash
   git commit -m "Added new UI test for login"
   ```
4. Push and create a pull request.

## Contact

For issues or contributions, reach out via:

- Email: **sarker.rashid@toyota.com / cristian.cobo@toyota.com**
- GitHub Issues: **[Repository Issues](https://github.com/toyota-gpt/issues)**

---

### 📌 **Happy Testing! 🚀**

