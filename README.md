# 🏦 Bank Account Management System (Core  Java)

This project is a console-based **Bank Account Management System** built using **Core Java** and **OOP principles** following an **industry-standard layered architecture**.

It allows users to :
- Create a bank account
- Deposit money
- Withdraw money
- Check balance  

The system is designed like a real backend using **Controller → Manager → Service → Repository → Model**.

---

##  Architecture Used

Main (Controller)
↓
BankManager
↓
OnboardingService & TransactionService
↓
AccountRepository
↓
BankAccount (Model)


This is the same architecture used in **Spring Boot and Microservices**.

---

## 📁 Folder Structure

src/
│
├── main/
│ └── Main.java
│
├── manager/
│ └── BankManager.java
│
├── service/
│ ├── OnboardingService.java
│ └── TransactionService.java
│
├── repository/
│ └── AccountRepository.java
│
├── model/
│ └── BankAccount.java
│
└── exception/
├── AccountNotFoundException.java
└── InsufficientBalanceException.java


---

## 🚀 Features

- Create bank account
- Store users in memory (ArrayList)
- Deposit & Withdraw money
- Check balance
- Clean separation of logic
- Scalable to database & Spring Boot

---

## 🛠️ Technologies Used

- Java (Core Java)
- OOP Concepts
- Collections (ArrayList)
- Exception Handling

---

## ▶ How to Run

1. Clone or download the project  
2. Open in any Java IDE (IntelliJ, Eclipse, VS Code)  
3. Run the `Main.java` file  
4. Follow console instructions  

---


