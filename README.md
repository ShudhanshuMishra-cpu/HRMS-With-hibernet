# HRMS Project

This project is a Human Resource Management System (HRMS) developed using Java, Hibernate, JPQL, and persistence annotations.

## Project Structure

The project structure is as follows:

- `src/main/java`: Contains Java source code files.
  - `com.example`: Package for entity classes, DAOs, services, and main application.
    - `Employee.java`: Entity class for employees.
    - `Department.java`: Entity class for departments.
    - `Register.java`: Class to handle user registration.
    - `Login.java`: Class to handle user authentication.
    - `MainApp.java`: Main application class.
  - Other packages and classes as needed.

- `src/main/resources`: Contains resources such as configuration files.
  - `persistence.xml`: Hibernate configuration file for defining persistence unit and database connection settings.

## Dependencies

The project depends on the following libraries:

- Hibernate: ORM framework for database interaction.
- Java Persistence API (JPA): Standard for ORM in Java applications.
- MySQL Connector/J: JDBC driver for MySQL database.
- Other dependencies as specified in the `pom.xml` file (if using Maven) or build.gradle (if using Gradle).

## Setup

1. Clone the project repository to your local machine.
2. Import the project into your preferred IDE (Eclipse, IntelliJ IDEA, etc.).
3. Configure database connection settings in the `persistence.xml` file.
4. Build and run the project.

## Usage

1. Use the `Register` class to register new employees into the system.
2. Use the `Login` class to authenticate users during login.
3. Customize and expand the project according to your HRMS requirements.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
