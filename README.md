# Quiz Application

This is a Quiz Application built using Spring Boot that allows users to create quizzes, add questions, fetch questions by category, and submit quiz responses to calculate scores. The application follows the MVC pattern, utilizing separate packages for models, controllers, services, and DAOs.

## Table of Contents

- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [API Endpoints](#api-endpoints)
- [Exception Handling](#exception-handling)

## Technologies Used

- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

## Project Structure

The project is organized into the following packages:

- **model**: Contains the model classes representing the database tables.
- **controller**: Contains the REST controllers handling HTTP requests.
- **service**: Contains the service classes containing business logic.
- **dao**: Contains the Data Access Object (DAO) interfaces for database operations.

## Features

- **REST Controller to Handle Requests for All Questions**: Created a REST controller to handle requests for fetching all questions.
- **Model Class**: Created model classes to represent the table columns.
- **Question DAO**: Created a Question DAO using Spring Data JPA for fetching data from the database.
- **Fetch Questions by Category**: Ability to fetch questions by category.
- **Add Question**: Method to add a question and return a success message.
- **Exception Handling**: Handling exceptions and HTTP response status codes in the question service.
- **Create Quiz**: Method to create a quiz and send data using a POST request.
- **Quiz with Questions**: Successfully created and fetched quiz data.
- **Question Wrapper Class**: Created a question wrapper class to exclude irrelevant data from the quiz response.
- **Submit Quiz and Calculate Score**: Method in the controller to submit a quiz and calculate the score.
- **Calculate Quiz Responses**: Created a method in the service for calculating quiz responses.

## Installation

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/quiz-application.git
   cd quiz-application
   ```

2. **Build the project**:
   ```bash
   mvn clean install
   ```

3. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

## Usage

The application runs on `http://localhost:8080`.

### API Endpoints

- **Get All Questions**
  ```http
  GET /questions/allquestions
  ```
  Fetch all questions from the database.

- **Fetch Questions by Category**
  ```http
  GET /questions/question/{category}
  ```
  Fetch questions based on a specific category.

- **Add Question**
  ```http
  POST /questions/addquestion
  ```
  Add a new question to the database. Request body should contain question details.

- **Create Quiz**
  ```http
  POST /quiz/create
  ```
  Create a new quiz with a specified number of questions from a category. Request parameters: `category`, `numQ`, `title`.

- **Get Quiz**
  ```http
  GET /quiz/getquiz/{id}
  ```
  Fetch quiz details by quiz ID.

- **Submit Quiz**
  ```http
  POST /quiz/submit/{id}
  ```
  Submit a quiz and calculate the score. Request body should contain responses to the quiz questions.

## Exception Handling

- The application handles exceptions and returns appropriate HTTP response status codes.
- Custom exceptions are used to handle various error scenarios.
- Response entities are used in both controller and service methods to return structured error responses.

## MVC Pattern

The application follows the MVC (Model-View-Controller) pattern:
- **Model**: Contains the entity classes like `Question` and `Quiz`.
- **Controller**: Handles incoming HTTP requests and returns responses. Example: `QuizController` and `QuestionController`.
- **Service**: Contains business logic. Example: `QuizService` and `QuestionService`.
- **DAO**: Interfaces for database operations. Example: `QuestionDAO`.
