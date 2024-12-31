# Simple Addition Operation - Backend

This repository contains the backend service for a simple addition operation. Built using **Java Spring Boot**, the backend exposes an API that display username,score, timestamp and stores the result in a **MySQL** database.

---

## Features
- **MySQL Integration**: Saves the result along with the username into a MySQL database.
- **API Endpoint**: Exposes a RESTful API at `http://localhost:8080/api/scores`.

---

## Prerequisites
1. **Java 8 or higher** installed on your machine.
2. **Spring Boot** dependencies.
3. **MySQL** installed and running.
4. **MySQL Database** with a table to store the results. You can create a database and table with the following schema:
   ```sql
   CREATE DATABASE add_operation;
   USE add_operation;
   CREATE TABLE scores (
       id INT AUTO_INCREMENT PRIMARY KEY,
       username VARCHAR(100),
       num1 DOUBLE,
       num2 DOUBLE,
       result DOUBLE
   );
MySQL Configuration: Update the application.properties file with your MySQL database credentials.
How to Set Up the Backend
Clone this repository:

Navigate to the project directory:

Install dependencies and build the project (using Maven or Gradle):
For Maven:

mvn clean install

Update application.properties with your MySQL database details:
properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/math_game
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
Run the application:

mvn spring-boot:run

API Endpoint
The backend exposes the following API endpoint:
POST /api/scores

Testing the Backend
Make sure the backend is running on http://localhost:8080.
You can use Postman or curl to test the API.
First, send a POST request to http://localhost:8080/api/scores.
After receiving the result, submit the username to save the result.

