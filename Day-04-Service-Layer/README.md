# Day 04 — Service Layer

## Objective

Learn the role of the Service Layer in a Spring Boot application and separate business logic from the REST Controller.

## Topics Learned

- Service Layer
- `@Service`
- Dependency Injection
- Constructor Injection
- Separation of concerns
- Controller-Service architecture

## Technologies Used

- Java
- Spring Boot
- Maven
- REST API
- JSON

## Implementation

Today I introduced a Service Layer into the Employee Management System.

The business logic that was previously handled directly by the controller was moved into `EmployeeService`.

The controller now communicates with the service layer to perform employee operations.

## Architecture

Client
   ↓
Controller
   ↓
Service
   ↓
Model