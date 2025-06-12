# Student Management System

A simple Student Management System application built using **Spring Boot** and **SQL database**. This project demonstrates the implementation of basic **CRUD (Create, Read, Update, Delete)** operations using RESTful APIs.

## Features

- Add new student records
- View all students
- Update student information
- Delete student records
- SQL database integration
- REST API support

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL (or any SQL database)
- Maven

## Getting Started

### Prerequisites

- Java 17 or above
- Maven
- MySQL

### Setup

1. Clone the repository:

```
git clone https://github.com/your-username/student-management-system.git
cd student-management-system

```
#### Database

2. Configure your database connection in src/main/resources/application.properties:
   
```
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

## API Endpoints

| Method | Endpoint         | Description         |
|--------|------------------|---------------------|
| GET    | `/students`      | Get all students    |
| GET    | `/student/{id}` | Get student by ID   |
| POST   | `/student`      | Add new student     |
| DELETE | `/students/{id}` | Delete student by ID|

## Author

**Neha Bharti**  

Email: neetneha116@gmail.com 

GitHub: [neha-dev-dot](https://github.com/your-github-neha-dev-dot)



