# 🍔 Food Delivery Backend API

Welcome to the **Food Delivery Backend** 🚀! This project is built with **Spring Boot** for handling backend operations efficiently. It provides RESTful APIs to manage users, restaurants, orders, and payments.

## 📌 Features
✅ User Authentication & Authorization (JWT) 🔐  
✅ Restaurant Management 🍽️  
✅ Food Item Listings 🥗🍕  
✅ Order Management 📦  
✅ Payment Integration 💳  
✅ Admin Dashboard 📊  

---

## 🛠️ Tech Stack
- **Backend**: Spring Boot, Java ☕
- **Database**: MySQL 🗄️
- **Security**: JWT, Spring Security 🔑
- **API Documentation**: Swagger 📜

---

## 🚀 Getting Started
### 🔧 Prerequisites
Ensure you have the following installed:
- Java 21 ☕
- Maven 3+ 🏗️
- MySQL 8+ 🗄️

### 📥 Installation & Setup
1️⃣ Clone the repository:  
```sh
 git clone https://github.com/Food-Delivery-App/food-delivery-backend.git
```
2️⃣ Navigate to the project directory:  
```sh
 cd food-delivery-backend
```
3️⃣ Configure **`application.properties`** (Database, JWT)  
4️⃣ Build and run the application:  
```sh
 mvn spring-boot:run
```

---

## 📡 API Endpoints
### 🔑 Authentication
- `POST /api/auth/register` → Register a new user 🆕
- `POST /api/auth/login` → User login 🔑

### 🍽️ Restaurants
- `GET /api/restaurants` → Get all restaurants 📋
- `POST /api/restaurants` → Add a new restaurant ✨

### 🥡 Orders
- `POST /api/orders` → Place an order 🛍️
- `GET /api/orders/{id}` → Get order details 📦


_For a full list of API endpoints, check out the Swagger documentation at_ `http://localhost:8080/swagger-ui.html` 📖

---


---

## 🤝 Contributing
Contributions are welcome! Feel free to **fork** this repo and submit a **pull request**. 🎉

---

## 📜 License
This project is licensed under the **MIT License** 📄.

---

## 📧 Contact
📌 **Author**: Methal Kumar Yadav  
📌 **Email**: meetyadav786@gmail.com
📌 **LinkedIn**: [Meet Yadav](https://www.linkedin.com/in/methal-yadav-meet-27903329a/)

Happy coding! 🚀🔥
