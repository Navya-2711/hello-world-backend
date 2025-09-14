# Hello World Spring Boot Application

A simple Spring Boot application that demonstrates the basics of creating a REST API with "Hello World" endpoints.

## Project Structure

```
hello-world-spring-boot/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── helloworldspringboot/
│   │   │               ├── HelloWorldSpringBootApplication.java
│   │   │               └── controller/
│   │   │                   └── HelloWorldController.java
│   │   └── resources/
│   │       └── application.properties
├── pom.xml
└── README.md
```

## Prerequisites

- Java 17 or higher
- Maven 3.6 or higher

## How to Run

1. Navigate to the project directory:
   ```bash
   cd C:\Users\NAVYA\CascadeProjects\hello-world-spring-boot
   ```

2. Build the project:
   ```bash
   mvn clean compile
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

   Or alternatively, you can build a JAR and run it:
   ```bash
   mvn clean package
   java -jar target/hello-world-spring-boot-1.0.0.jar
   ```

## Available Endpoints

Once the application is running, you can access the following endpoints:

- **GET /** - Returns "Hello World from Spring Boot!"
- **GET /hello** - Returns "Hello World!"
- **GET /greet** - Returns "Greetings from your Spring Boot application!"

## Testing the Application

Open your web browser or use a tool like curl to test the endpoints:

```bash
curl http://localhost:8080/
curl http://localhost:8080/hello
curl http://localhost:8080/greet
```

## Configuration

The application runs on port 8080 by default. You can modify this in the `application.properties` file.

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Test (for testing)

## Next Steps

This is a basic Hello World application. You can extend it by:
- Adding more REST endpoints
- Implementing database connectivity
- Adding security features
- Creating a web interface
- Adding unit and integration tests
