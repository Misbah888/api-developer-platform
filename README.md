# API Developer Platform

A microservices-based backend platform built using Java and Spring Boot. The project demonstrates service discovery, API Gateway routing, containerization, database integration, cloud deployment, and CI/CD automation.

## Architecture

The platform consists of:

- **Developer Service** – Handles developer-related APIs and data.
- **API Gateway** – Acts as the single entry point and routes requests to backend services.
- **Eureka Service Registry** – Provides service registration and discovery.
- **MySQL** – Persistent database for application data.

## Tech Stack

- Java
- Spring Boot
- Spring Cloud Gateway
- Netflix Eureka
- Spring Data JPA / Hibernate
- MySQL
- Docker
- Docker Compose
- AWS EC2
- GitHub Actions
- Maven

## Key Features

- Microservices-based architecture
- Eureka service registration and discovery
- API Gateway routing
- Load-balanced service discovery
- Docker containerization
- Docker Compose for multi-container setup
- MySQL persistence
- Environment-based configuration
- Health checks
- AWS EC2 deployment
- GitHub Actions CI/CD pipeline
- Automated testing and Docker image publishing

## Project Structure

```text
api-developer-platform/
│
├── api-gateway/
├── developer-service/
├── service-registry/
├── .github/
│   └── workflows/
├── docker-compose.yml
└── .gitignore
```

## CI/CD

GitHub Actions is used to automate the deployment workflow:

1. Build the application
2. Run tests
3. Build Docker images
4. Push images to Docker Hub
5. Deploy the application to AWS EC2

## Deployment

The services are containerized using Docker and deployed on an AWS EC2 instance.

Docker Compose is used to manage the application containers and networking.

## Learning Outcomes

This project provided hands-on experience with:

- Designing microservices
- Service discovery using Eureka
- API Gateway implementation
- Docker and container networking
- Cloud deployment using AWS EC2
- CI/CD automation with GitHub Actions
- Backend service communication
- Environment and configuration management
