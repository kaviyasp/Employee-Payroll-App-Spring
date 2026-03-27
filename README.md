# Employee Payroll App (Spring Boot)

## Overview

This project is a **Spring Boot backend application** for managing employee payroll data.
It provides REST APIs to perform CRUD operations and stores data in a **MySQL database**.

---

## Features

### UC1: Project Setup

* Created Spring Boot project using Spring Initializr
* Configured Maven project structure
* Added dependencies:

  * Spring Web
  * Spring Data JPA
  * Validation
  * MySQL Driver
  * DevTools
* Successfully ran application on localhost

---

### UC2: REST API Development

* Implemented REST Controller
* Supported HTTP methods:

  * GET
  * POST
  * PUT
  * DELETE
* Tested APIs using browser and CURL

---

### UC3: Service Layer + DTO + Model

* Introduced layered architecture:

  * DTO (Data Transfer Object)
  * Model (Entity representation)
  * Service Layer (Business logic)
* Implemented in-memory data storage (List)
* Used `@Autowired` for dependency injection

---

### UC4: Database Integration

* Connected application to MySQL database
* Used Spring Data JPA for persistence
* Created Repository layer using `JpaRepository`
* Implemented full CRUD operations with database storage
* Enabled automatic table creation using Hibernate

---

## Architecture

```text
Controller → Service → Repository → Database
```

---

## API Endpoints

| Method | Endpoint                              | Description        |
| ------ | ------------------------------------- | ------------------ |
| GET    | `/employeepayrollservice/`            | Get all employees  |
| GET    | `/employeepayrollservice/get/{id}`    | Get employee by ID |
| POST   | `/employeepayrollservice/create`      | Create employee    |
| PUT    | `/employeepayrollservice/update/{id}` | Update employee    |
| DELETE | `/employeepayrollservice/delete/{id}` | Delete employee    |

---

## Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST API

---

## How to Run

### 1. Clone the repository

```
git clone <your-repo-link>
```

### 2. Open in IntelliJ

### 3. Setup MySQL

```
CREATE DATABASE employee_payroll_app;
```

### 4. Configure application.properties

```
spring.datasource.url=jdbc:mysql://localhost:3306/employee_payroll_app
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### 5. Run the application

Run:

```
EmployeePayrollAppApplication.java
```

### 6. Access APIs

```
http://localhost:8080/employeepayrollservice/
```

---

## Sample CURL Commands

### Create Employee

```
curl -X POST -H "Content-Type: application/json" \
-d '{"name":"Kaviya","salary":5000}' \
http://localhost:8080/employeepayrollservice/create
```

### Get All Employees

```
curl http://localhost:8080/employeepayrollservice/
```

---

## Project Structure

```
src/main/java/com/bridgelabz/employeepayrollapp
│
├── controller
├── service
├── repository
├── model
└── dto
```

---

## Notes

* Database is required for UC4
* Hibernate automatically creates tables
* Ensure MySQL server is running

---

## Future Enhancements

* Exception Handling (`@ControllerAdvice`)
* Input Validation (`@Valid`)
* Response DTO for structured API responses
* Logging and Monitoring

---

## Author

* Kaviya S P
