# Day 05 — Repository Layer

## Objective

Learn the role of the Repository Layer in a Spring Boot application and introduce Spring Data JPA for database interaction.

## Topics Learned

- Repository Layer
- Spring Data JPA
- `JpaRepository`
- `@Entity`
- `@Id`
- Dependency Injection
- Separation of concerns
- Basic database repository operations

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Maven
- REST API
- JPA
- Hibernate

## Implementation

Today I introduced the Repository Layer into the Employee Management System.

The application now follows a layered architecture:

```text
Client
   ↓
Controller
   ↓
Service
   ↓
Repository
   ↓
Database