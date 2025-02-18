# Student Management System

## Overview
The **Student Management System** is a web-based application built using **Java Servlets** that enables educational institutions to manage student data efficiently. The system provides functionalities for adding, updating, and retrieving student information, offering a streamlined approach to academic record management.

## Table of Contents
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Requirements](#requirements)
- [Installation](#installation)
- [Running the Project](#running-the-project)
- [API Endpoints](#api-endpoints)
- [License](#license)

## Technologies Used
- Java (Servlets, JDBC)
- HTML, CSS, JavaScript
- MySQL Database
- Apache Tomcat (Server)
- JSP (JavaServer Pages)

## Features
- **Student Registration:** Add new students with essential details.
- **Student Record Management:** Update and delete student records.
- **Search and View:** Retrieve student details based on criteria.
- **Database Integration:** Uses MySQL for persistent data storage.
- **Web-based Interface:** User-friendly UI for managing students.

## Requirements
To run this project, you will need:
- JDK 8 or later
- Apache Tomcat 9 or later
- MySQL Server
- Any IDE (Eclipse, IntelliJ IDEA, or NetBeans)

## Installation
1. **Clone the repository:**
   ```bash
   git clone https://github.com/Deepakg-code/ServletProject_Student-Management-System.git
   cd ServletProject_Student-Management-System
   ```
2. **Setup MySQL Database:**
   - Create a database in MySQL.
   - Import the provided SQL script (`database.sql`).
   - Update database credentials in `dbConfig.java`.
3. **Deploy on Tomcat:**
   - Open the project in an IDE.
   - Build and deploy it on an Apache Tomcat server.

## Running the Project
1. Start the MySQL server.
2. Deploy the project on Tomcat.
3. Open the application in a browser at:
   ```
   http://localhost:8080/StudentManagementSystem
   ```

## API Endpoints
| Method | Endpoint              | Description                     |
|--------|-----------------------|---------------------------------|
| GET    | `/students`           | Fetch all student records       |
| POST   | `/students/add`       | Add a new student               |
| PUT    | `/students/update`    | Update student details          |
| DELETE | `/students/delete?id={id}` | Delete a student by ID        |

## License
This project is open-source and available for educational purposes.

---
**Contributions & Feedback:** If you'd like to contribute or have any suggestions, feel free to open an issue or a pull request on GitHub.
