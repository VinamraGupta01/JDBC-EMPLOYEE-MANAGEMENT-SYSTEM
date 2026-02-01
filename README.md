# JDBC Employee Management System

A **console-based Java application** built using **JDBC** and the **DAO design pattern** to perform complete **CRUD (Create, Read, Update, Delete)** operations on an Employee database.

This project focuses on clean backend architecture, proper separation of concerns, and real-world database interaction using Java.

---

## 🚀 Features

- Add a new employee  
- View all employees  
- View employee by ID  
- Update employee details  
- Delete employee records  
- DAO pattern for clean and maintainable code  
- MySQL database integration using JDBC  

---

## 🛠️ Tech Stack

- **Java**
- **JDBC**
- **MySQL**
- **VS Code**
- **Git & GitHub**

---

## 📂 Project Structure

JDBC-EMPLOYEE-MANAGEMENT-SYSTEM
│
├── src/
│ ├── dao/
│ │ ├── EmployeeDao.java
│ │ └── EmployeeDaoImplementation.java
│ │
│ ├── model/
│ │ └── Employee.java
│ │
│ ├── util/
│ │ └── DBConnection.java
│ │
│ └── main/
│ └── Main.java
│
├── lib/
│ └── mysql-connector-j-8.x.x.jar
│
├── .gitignore
├── LICENSE
└── README.md


---

## 🗄️ Database Schema

### Table: `EMPLOYEE`

| Column Name   | Data Type |
|--------------|-----------|
| ID           | INT (PK)  |
| NAME         | VARCHAR   |
| DEPARTMENT   | VARCHAR   |
| SALARY       | DOUBLE    |
| JOINING_DATE | DATE      |

---

## ⚙️ How to Run the Project

1. **Clone the repository**
```bash
git clone https://github.com/VinamraGupta01/JDBC-EMPLOYEE-MANAGEMENT-SYSTEM.git
Add MySQL Connector JAR

Download MySQL Connector/J

Place it inside the lib/ folder

Add it to the classpath

Configure Database

Update database URL, username, and password in DBConnection.java

Compile and Run

javac main/Main.java
java main.Main
🎯 Learning Outcomes
Hands-on experience with JDBC

Understanding and implementation of DAO Design Pattern

Database connectivity and SQL handling in Java

Clean project structure and modular code

Git & GitHub workflow for real projects

👨‍💻 Author
Vinamra Gupta
BCA Student | Java Backend Development
Aspiring Software Engineer

📌 License
This project is licensed under the MIT License.


---

## ✅ HOW TO USE THIS

1. Create file:
README.md

2. Paste everything above
3. Save
4. Run:
```bash
git add README.md
git commit -m "Add professional README"
git push
