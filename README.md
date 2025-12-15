# 🏡 Airbnb Clone

A scalable backend system inspired by Airbnb, built using **Spring Boot**, **JPA/Hibernate**, and **PostgreSQL**.  
This project focuses on clean domain modeling, data integrity, and reliable booking workflows, reflecting how real-world hospitality platforms are designed.

The backend is being built incrementally with an emphasis on:
- correctness over shortcuts
- explicit modeling of availability and inventory
- long-term maintainability and extensibility

---

## 🎯 Project Vision

The goal of this project is to model the core backend foundations of a short-term rental platform, including:

- Property listings and metadata
- Reusable amenities and media assets
- Date-based availability and pricing
- A concurrency-safe booking foundation

Design decisions prioritize clarity, consistency, and real-world constraints over minimal implementations.

---

## ✨ Key Capabilities

- 🏨 Property (Hotel) management  
- 📍 Embedded address, location, and contact information  
- 🏷 Reusable amenity catalog  
- 🖼 Listing-level photo management  
- 📅 Per-day availability and dynamic pricing  
- 🔒 Transaction-safe booking groundwork  

---

## 🧠 Design Principles

- Normalize transactional data to ensure correctness  
- Embed value objects to reduce unnecessary joins  
- Separate lifecycle concerns (listing, inventory, media)  
- Model availability explicitly to prevent double bookings  
- Favor extensibility over premature optimization  

---

## 🛠 Technology Stack

- Java 17  
- Spring Boot  
- Spring Data JPA (Hibernate)  
- PostgreSQL  
- Maven  

---

## 📁 Project Structure

    src/main/java/com/example/airbnb
     ├── models          # Domain & JPA entities
     ├── repositories    # Persistence layer
     ├── services        # Business logic
     ├── controllers     # REST APIs
     └── config          # Application configuration

---

## 🔁 Booking Model Overview

Availability is modeled per property per date rather than as date ranges.

This enables:
- Prevention of double bookings
- Safe handling of concurrent requests
- Dynamic, per-day pricing
- Host-controlled blocked dates

The availability calendar acts as the single source of truth for bookings.

---

## 🚧 Roadmap

Planned additions include:

- Room-level inventory modeling  
- Booking and payment workflows  
- Cancellation policies  
- Redis-based caching  
- ElasticSearch-powered search  
- Event-driven booking flow  

---

## 🔮 Frontend (Planned)

A frontend application will be added in a later phase of this project.

The current focus is on building a robust and well-structured backend, ensuring:
- correct domain modeling
- stable availability and booking foundations
- scalable data access patterns

Once the backend stabilizes, a frontend (web or mobile) will be introduced to consume the APIs.

---

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher  
- Maven  
- PostgreSQL  

### Run Locally

    git clone https://github.com/your-username/airbnb-backend.git
    cd airbnb-backend
    mvn spring-boot:run

Database configuration can be updated in `application.yml`.

---

## 📌 Project Scope

This project is intended to:
- Explore realistic backend design challenges
- Practice clean ORM and schema modeling
- Serve as a foundation for future extensions

It intentionally avoids UI concerns and focuses on backend correctness and structure.

---

## 📝 Notes

This README is treated as a living document and will evolve alongside the system as new features and architectural components are added.
