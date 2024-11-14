# User Authentication with Spring Boot 6 and JWT

This project demonstrates how to implement user login and registration functionality using **Spring Boot 6** and **Spring Security**, leveraging **JWT (JSON Web Token)** for secure, stateless authentication. This application provides a fully functional authentication system for modern web applications with JWT-based token handling.

## Features:
- **User Registration**: Allows users to sign up with secure password storage (using BCrypt encryption).
- **User Login**: Authenticates users and generates a JWT token for secure access to protected resources.
- **JWT Authentication**: Provides stateless authentication with JWT, where the token is passed in HTTP headers for access control.
- **Spring Security**: Configured to secure endpoints, manage sessions, and validate tokens for protected routes.

## Technologies Used:
- **Spring Boot 6**: A powerful framework for building Java-based backend applications.
- **Spring Security 6**: Provides authentication and authorization features, including support for JWT.
- **JWT (JSON Web Token)**: A secure way to represent claims between two parties, used here for stateless authentication and session management.
- **BCrypt**: A strong password hashing function to securely store user credentials.

## Setup and Usage

### Prerequisites:
- Java 17 or higher
- Maven or Gradle for project management
- An IDE (IntelliJ IDEA, Eclipse, etc.)

### Steps to Run the Application:
1. Clone the repository:
   ```bash
   git clone https://github.com/sangeeta586/Spring_Security_6.git
