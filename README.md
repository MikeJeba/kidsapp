# Simple Addition Operation Project

A basic web application for performing addition operations.  
This project is designed for learning and implementing full-stack development, combining **HTML**, **CSS**, and **JavaScript** on the frontend, with a **Java Spring Boot** backend and a **MySQL** database.

---

## Features

- **Frontend**: 
  - Simple and user-friendly interface to perform addition.
  - Input validation for numeric values.
  
- **Backend**:
  - REST API developed with Java Spring Boot to process the addition operation.
  - Handles user input and ensures secure communication.

- **Database**:
  - MySQL database to store calculation history.

---

## Tech Stack

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Java Spring Boot
- **Database**: MySQL

---

## Prerequisites

Ensure you have the following installed on your system:

1. [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
2. [Spring Boot CLI](https://spring.io/tools)
3. [MySQL](https://dev.mysql.com/downloads/)
4. Git (for version control)

---

## Installation and Setup

### 1. Clone the Repository

2. Setup the Frontend
Navigate to the frontend directory:

3. Setup the Backend
Navigate to the backend directory:

Open the project in your IDE (e.g., IntelliJ IDEA).

Configure the database:

Open application.properties in the src/main/resources directory.

Set the following properties:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/<project name>

spring.datasource.username=<your_mysql_username>

spring.datasource.password=<your_mysql_password>

spring.jpa.hibernate.ddl-auto=update

Replace <your_mysql_username> and <your_mysql_password> with your MySQL credentials.

Start the backend server:
./mvnw spring-boot:run

4. Database Setup
Create a new database in MySQL:

sql

CREATE DATABASE simple_addition;

The application will automatically create the required tables when it runs.

Usage
Open the index.html file in your browser.

The result will be displayed on the page, and the calculation will be saved in the database.

API Endpoints
The backend exposes the following REST API endpoint:

POST /api/add
Request Body (JSON):
json

Fork the repository.
Create a new branch for your feature:

git checkout -b feature-name

Commit your changes and push to your fork:

git push origin feature-name
Open a pull request.

License
This project is licensed under the MIT License.

Contact
For any questions or feedback, feel free to reach out:
Email: jebajovitha@gmail.com





