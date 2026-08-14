# Day 06 — Database Integration

## Objective

Connect the Employee Management System to a MySQL database and configure Spring Boot to communicate with the database using Spring Data JPA and Hibernate.

## Topics Learned

- MySQL database
- Database connection
- JDBC driver
- Spring Boot datasource configuration
- JPA
- Hibernate
- `application.properties`
- `spring.jpa.hibernate.ddl-auto`
- Database schema generation

## Technologies Used

- Java
- Spring Boot
- Maven
- MySQL
- Spring Data JPA
- Hibernate
- REST API

## Implementation

Today I connected the Employee Management System to a MySQL database.

A database named `employee_management` was created and Spring Boot was configured to connect to it.

## Database Configuration

The application uses the following configuration:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/employee_management
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true