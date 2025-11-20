🏥 Hospital Management System — Microservices + gRPC + Spring Boot 3

A fully distributed Hospital Management System built using:

Spring Boot 3 (Java 21)

gRPC (v1.70.0)

Maven Multi-Module Architecture

PostgreSQL

Proto-based shared contracts

This project demonstrates clean microservice communication using gRPC, with proto-common used as the shared contract layer.

📂 Project Structure
hospitalmanagement/
│── pom.xml                  # Parent Maven project
│
├── proto-common/            # Shared proto definitions (gRPC contracts)
│
├── patient-management/      # Patient microservice (gRPC server + database)
│
├── doctor/                  # Doctor microservice (gRPC server + database)
│
└── appointment-service/     # Appointment microservice (gRPC client + server)

⚙️ Technologies Used
🛠 Backend

Java 21

Spring Boot 3.5.x

Spring Data JPA

Spring Web

Lombok

🗄 Database

PostgreSQL

Hibernate ORM

🔗 Communication

gRPC (manual channels)

Protocol Buffers v3

Shared module: proto-common

🚀 Services Overview
1️⃣ patient-management-service

Exposes gRPC server on port 9090

Stores and retrieves patient information

Uses PostgreSQL for persistence

gRPC Method Example:
rpc GetPatientById(PatientRequest) returns (PatientResponse)

2️⃣ doctor-service

Exposes gRPC server on port 9091

Handles doctor details

Uses PostgreSQL for persistence

gRPC Method Example:
rpc GetDoctorById(DoctorRequest) returns (DoctorResponse)

3️⃣ appointment-service

Acts as gRPC client to both patient & doctor services

Exposes its own gRPC server on port 9092

gRPC clients are implemented using manual ManagedChannel (Spring Boot 3 compatible)

Communicates across services using data from proto-common

🔗 Inter-Service Communication Flow
Example: TestConnection RPC

Appointment-service calls:

patient-management-service to get patient name

doctor-service to get doctor name

Combines both → returns response

🔧 Run Instructions
1️⃣ Start PostgreSQL

Create three databases:

patientdb
doctordb
appointmentdb

2️⃣ Build proto-common
cd proto-common
mvn clean install


This generates all gRPC Java classes shared across all microservices.

3️⃣ Run microservices in this order:
🟦 Patient Service
cd patient-management
mvn spring-boot:run

🟩 Doctor Service
cd doctor
mvn spring-boot:run

🟧 Appointment Service
cd appointment-service
mvn spring-boot:run

🎯 gRPC Ports & Service Endpoints
Service	HTTP Port	gRPC Port
patient-management	8082	9090
doctor-service	8081	9091
appointment-service	8083	9092
🧪 Testing gRPC with BloomRPC / Postman gRPC
Example Request:

Method:
TestConnection

Endpoint:
localhost:9092

Body:

{
  "patientId": "UUID-HERE",
  "doctorId": "UUID-HERE"
}


Expected Response:

{
  "patientName": "John Doe",
  "doctorName": "Dr. Smith"
}

📜 Features Implemented

Central proto definitions (proto-common)

Patient microservice

Doctor microservice

Appointment microservice

Cross-service gRPC communication

Manual ManagedChannels (Spring Boot 3 compatible)

gRPC server manually configured (no deprecated libraries)

PostgreSQL-backed persistence

🚀 Future Enhancements

Add Appointment CRUD

REST → gRPC API Gateway

Docker + Docker Compose for all services

Authentication with Keycloak

Centralized logging with ELK

👨‍💻 Author

Adikesh Pawar
GitHub: https://github.com/adikeshpawar/HospitalManagement
