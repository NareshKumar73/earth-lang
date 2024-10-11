# Spring Boot Internationalization (i18n) Example

This is a Spring Boot application demonstrating how to implement **internationalization (i18n)** using cookies for language storage and request parameters for language switching. The application features a `/greet` endpoint that returns a greeting message in the user's preferred language, with error handling for missing parameters.

## Features

- **Language Support**: English (`en`), Hindi (`hi`), French (`fr`), Spanish (`es`), and more can be added.
- **Cookie-Based Locale**: The user's preferred language is stored in a cookie (`lang`).
- **Request Parameter for Language Change**: The language can be changed by passing a `lang` parameter in the request.
- **Error Handling**: Handles missing `name` parameter with a localized error message.

## Technologies Used

- Spring Boot
- Internationalization (i18n)
- Cookie-based locale management
- Custom Exception Handling
- Java Validation API (JSR-303)

## How It Works

1. **Locale Detection**:
   - The application looks for the `lang` cookie to determine the user's language preference.
   - You can override the cookie by passing the `lang` parameter in the request (`/greet?lang=fr`).

2. **Error Handling**:
   - If the `name` parameter is missing in the request, the app returns a localized error message.

## Setup Instructions

Example Usage

Default Greeting in English

GET http://localhost:8080/greet?name=John

Response:

Hello, John!


Change Language to French

GET http://localhost:8080/greet?name=John&lang=fr

Response:

Bonjour, John!


Missing Name Parameter (Error Handling)

GET http://localhost:8080/greet

Response:

Name cannot be empty.


### 1. Clone the Repository

Ensure you have Java and Maven installed.

```bash
git clone https://github.com/NareshKumar73/earth-lang.git
cd earth-lang

mvn clean install
mvn spring-boot:run
