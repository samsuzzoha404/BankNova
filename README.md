# 🏦 BankNova – Bank Management System

## 📌 Overview
**BankNova** is a JavaFX-based **Bank Management System** with **SQLite** integration.  
It provides secure and role-based access for **Admins** and **Clients** to manage accounts, perform transactions, and monitor banking activities.  

---

## ✨ Features

### 🔑 Authentication & Roles
- Secure login system with **role-based dashboards**.  
- Separate menus for **Admin** and **Client**.  

### 👨‍💼 Admin Module
- Create, update, and delete **client accounts**.  
- Monitor all **transactions** in the system.  
- Access to administrative reports (future enhancement).  

### 👤 Client Module
- View personal **account balance**.  
- Perform **deposits, withdrawals, and transfers**.  
- Track transaction history.  

### 💳 Account & Transaction Management
- Abstract `Account` class with `SavingsAccount` & `CheckingAccount`.  
- Linked `Transaction` model for deposits, withdrawals, and transfers.  
- Persistent storage via **SQLite database**.  

---

## 🛠 Tech Stack
- **Language**: Java  
- **GUI Framework**: JavaFX + FXML  
- **Database**: SQLite  
- **Tools**: SceneBuilder, IntelliJ IDEA / NetBeans / Eclipse  

---

## 📂 Project Structure
BankNova/
│── src/
│ ├── Account.java (Abstract)
│ ├── SavingsAccount.java
│ ├── CheckingAccount.java
│ ├── Client.java
│ ├── Transaction.java
│ ├── DatabaseDriver.java
│ ├── controllers/ # JavaFX Controllers
│ └── views/ # FXML Files
│
│── resources/
│ ├── styles.css
│ └── icons/
│
└── BankNova.db # SQLite Database

## 🚀 Getting Started

### Prerequisites
- Java 11+  
- JavaFX SDK installed & configured  
- SQLite JDBC Driver  

### Run the Project
```bash
# Clone the repository
git clone https://github.com/yourusername/BankNova.git
cd BankNova

# Open in IDE (IntelliJ / NetBeans / Eclipse)
# Run the Main class
