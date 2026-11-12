# PWCommerce

Academic e-commerce backend developed at UTFPR with Java and Spring Boot.

## Features

- Categories and products.
- User registration.
- JWT authentication and authorization components.
- Username validation and error handling.
- Persistence with Spring Data JPA.

## Run locally

Install the JDK specified in pom.xml and run from the repository root:

```bash
sh mvnw spring-boot:run
```

src/main/resources/application.yml configures port 8025 and enables the H2 console at /h2-console. Review database and security settings before testing routes.

## Structure

Controllers receive requests, services implement operations and repositories access persistent models. Security components are under security/.

## Tests

```bash
sh mvnw test
```

## Context

A learning project covering REST APIs, validation, authentication and persistence. It is not a commercial operation.
