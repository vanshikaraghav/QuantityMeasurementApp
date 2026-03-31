
---

# 📏 Quantity Measurement App

## 📋 Project Overview

The **Quantity Measurement App** is a Spring Boot backend application that allows users to perform **unit conversions and arithmetic operations** across multiple measurement categories like **Length, Weight, Volume, and Temperature**.

This project is designed using **clean architecture principles (N-Tier)** and demonstrates strong backend concepts like **OOP, Generics, REST APIs, Security, and Database Integration**.

---

## ✨ Key Features

### 🔹 Measurement Operations

* ✅ Compare quantities (e.g., 1 feet = 12 inches)
* ✅ Unit conversion (feet ↔ inches, kg ↔ grams, etc.)
* ✅ Arithmetic operations:

  * Addition
  * Subtraction
  * Division

### 🔹 Multi-Category Support

* 📏 Length (Feet, Inch, Yard, etc.)
* ⚖️ Weight (Kg, Gram)
* 🧪 Volume
* 🌡️ Temperature (with controlled operations)

### 🔹 Backend Capabilities

* 🔐 JWT Authentication
* 🔑 Google OAuth Login
* 🗄️ Database Integration (JPA + MySQL/H2)
* 📡 RESTful APIs
* 🧱 Layered Architecture (Controller → Service → Repository)

---

## 🛠 Tech Stack

### Backend

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA
* JWT Authentication
* OAuth 2.0 (Google Login)

### Database

* H2 (Development)
* MySQL (Production)

### Tools

* Maven
* Lombok

---

## 📁 Project Structure

```
src/main/java/com/app/quantitymeasurement/

├── controller/        # REST APIs
├── service/           # Business logic
├── repository/        # Database layer
├── entity/            # JPA entities
├── dto/               # Request/Response objects
├── model/             # Core quantity logic (units, conversions)
├── security/          # JWT & OAuth configuration
├── exception/         # Custom exceptions
├── config/            # Spring configuration
└── util/              # Utility classes
```

---

## 🚀 How to Run the Project

### 🔧 Prerequisites

* Java 21+
* Maven
* MySQL (optional)

---

### ▶️ Steps

1. Clone the repository

```bash
git clone https://github.com/vanshikaraghav/QuantityMeasurementApp.git
cd QuantityMeasurementApp
```

2. Build the project

```bash
mvn clean install
```

3. Run the application

```bash
mvn spring-boot:run
```

4. Open in browser

```
http://localhost:8080
```

5. H2 Console (if enabled)

```
http://localhost:8080/h2-console
```

---

## 📡 API Endpoints

### 🔐 Authentication

| Method | Endpoint                   | Description                  |
| ------ | -------------------------- | ---------------------------- |
| POST   | `/api/auth/login`          | Login with username/password |
| GET    | `/api/auth/google-success` | Google OAuth login           |

---

### 📏 Quantity APIs

| Method | Endpoint                 | Description            |
| ------ | ------------------------ | ---------------------- |
| POST   | `/api/quantity/compare`  | Compare two quantities |
| POST   | `/api/quantity/add`      | Add quantities         |
| POST   | `/api/quantity/subtract` | Subtract quantities    |
| POST   | `/api/quantity/divide`   | Divide quantities      |
| POST   | `/api/quantity/convert`  | Convert units          |
| GET    | `/api/quantity/all`      | Get all records        |
| GET    | `/api/quantity/{id}`     | Get by ID              |
| DELETE | `/api/quantity/{id}`     | Delete record          |

---

## 🧾 Sample Request

### Compare Quantities

```json
{
  "q1": { "value": 1, "unit": "FEET" },
  "q2": { "value": 12, "unit": "INCH" }
}
```

---

### Convert Units

```json
{
  "value": 100,
  "fromUnit": "CENTIMETER",
  "toUnit": "METER"
}
```

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Generics in Java
* Interface-based design
* REST API design
* Dependency Injection (DI)
* Spring Security (JWT + OAuth)
* JPA & ORM Mapping

---

## ⚡ Challenges Solved

* Designing a **generic unit system** for multiple categories
* Handling **accurate unit conversions**
* Ensuring **type-safe arithmetic operations**
* Implementing **secure authentication flow**
* Structuring project using **clean architecture**

---



## 👩‍💻 Author

**Vanshika Raghav**




