# HelloUsers_RestAPI
**README.md — Spring Boot REST API with Docker & GitHub Actions**
**🚀 Overview**
This project is a Spring Boot REST API built with Java 26, containerized using Docker, and automated with GitHub Actions CI/CD.
It exposes REST endpoints on port 8080, supports multiple content types (JSON, XML, plain text), and includes unit + integration tests

**🧰 Tech Stack**
Java 26 (Temurin),Spring Boot,Maven,JUnit 5,MockMvc,Docker,GitHub Actions CI/CD(*ignore for now),H2 (for integration tests)

**📦 Project Structure**
src/main/java        → Application + Controllers + Services
src/test/java        → Unit + Integration Tests
Dockerfile           → Runtime image (Java 26 JRE)
.github/workflows    → CI/CD pipeline(*ignore for now)
pom.xml              → Maven configuration

**🔧 Prerequisites**

**Install the following:**
Java 26,Maven 3.9+,Docker Desktop,Git

**Verify installations:**
java -version,mvn -version, docker --version,git --version

**📥 1. Clone the Repository**
git clone https://github.com/<your-username>/<your-repo>.git
cd <your-repo>

**🏗️ 2. Build the Project**
mvn clean package
***This will generate ---target/<your-app>.jar


**▶️ 3. Run the Application (Without Docker)**
mvn spring-boot:run OR java -jar target/*.jar

**Check the below in you window/internet explorer API as it should be is now available at**:

http://localhost:8080/hello/users
http://localhost:8080/hello/users/2
http://localhost:8080/hello/users/2?accept=application/json
http://localhost:8080/hello/users/2?accept=application/xml

**Run the JAR directly**
java -jar demoforspringBoot-0.0.1-SNAPSHOT.jar



