# school-management-system-10320






📚 School Administration Management System (Java OOP)
🚀 Overview

This project is a School Administration Management System developed using Object-Oriented Programming (OOP) concepts in Java.

It demonstrates key OOP principles such as:

✅ Inheritance
✅ Polymorphism
✅ Method Overriding
✅ Dynamic Method Dispatch
✅ Downcasting
🧠 Concepts Used
🔹 1. Inheritance
Teacher and Student classes inherit from the base class Person.
🔹 2. Polymorphism
Objects of Teacher and Student are treated as Person.
Method showRole() behaves differently at runtime.
🔹 3. Method Overriding
showRole() is overridden in both Teacher and Student.
🔹 4. Dynamic Method Dispatch
Achieved using:
for (Person p : people)
🔹 5. Downcasting
Used to access subclass-specific methods:
Teacher t = (Teacher) p1;
Student s = (Student) p2;
📂 Project Structure
School-Management-System/
│
├── Main.java
├── Person.class
├── Teacher.class
├── Student.class
⚙️ How to Run
🔹 Step 1: Compile
javac Main.java
🔹 Step 2: Run
java Main
🖥️ Sample Output
=== School Administration System ===

I am a Teacher. I teach students.

I am a Student. I study subjects.

=== Detailed Information ===

Name: Mr. Ashutosh
Age: 30
Subject: Mathematics
Salary: 50000.0

Name: Mr. Pankaj
Age: 40
Roll Number: 101
Course: Computer Science
🎯 Features
📌 Demonstrates real-world use of OOP concepts
📌 Clean and modular class structure
📌 Easy to understand for beginners
📌 Uses runtime polymorphism effectively
🛠️ Technologies Used
Java
OOP Concepts
📌 Future Improvements
Add user input (Scanner)
Store multiple students/teachers (ArrayList)
Add menu-based system
Connect with database (MySQL)
