📘 JDBC Employee Management System

A console-based Java application built using JDBC and DAO design pattern to perform full CRUD operations on an Employee database.

This project demonstrates clean backend structure, database connectivity, and separation of concerns using industry-relevant practices.

🚀 Features

Add a new employee

View all employees

View employee by ID

Update employee details

Delete employee

Uses DAO Pattern for clean architecture

MySQL database integration using JDBC

🛠️ Tech Stack

Java

JDBC

MySQL

VS Code

Git & GitHub

📂 Project Structure
JDBC-EMPLOYEE-MANAGEMENT-SYSTEM
│
├── src/
│   ├── dao/
│   │   ├── EmployeeDao.java
│   │   └── EmployeeDaoImplementation.java
│   │
│   ├── model/
│   │   └── Employee.java
│   │
│   ├── util/
│   │   └── DBConnection.java
│   │
│   └── main/
│       └── Main.java
│
├── lib/
│   └── mysql-connector-j-8.x.x.jar
│
├── .gitignore
├── LICENSE
└── README.md

🗄️ Database Schema

Table: EMPLOYEE

Column Name	Type
ID	INT (PK)
NAME	VARCHAR
DEPARTMENT	VARCHAR
SALARY	DOUBLE
JOINING_DATE	DATE
⚙️ How to Run

Clone the repository:

git clone https://github.com/VinamraGupta01/JDBC-EMPLOYEE-MANAGEMENT-SYSTEM.git


Add MySQL Connector JAR to lib/

Update database credentials in DBConnection.java

Compile and run:

javac main/Main.java
java main.Main

🎯 Learning Outcomes

Hands-on experience with JDBC

Understanding of DAO design pattern

Clean project structuring

Real-world CRUD operations

Git & GitHub workflow

👨‍💻 Author

Vinamra Gupta
BCA Student | Backend Development (Java)
Aspiring Software Engineer

📌 License

This project is licensed under the MIT License.
