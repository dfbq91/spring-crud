# Spring CRUD

A simple CRUD application created with Spring.

## Installation

* Clone the project: git clone https://github.com/dfbq91/spring-crud/
* Import to your IDE
* Execute the main method from Application class

## Execution with Maven

* Clone th project: git clone https://github.com/dfbq91/spring-crud/
* cd spring-crud
* mvn spring-boot:run

## Using .jar file

The built .jar file is auto-runnable, so as you can move it to any computer having java installed and run the app.

* Clone the project: git clone https://github.com/dfbq91/spring-crud/
* cd spring-crud
* java -jar target/spring-0.0.1-SNAPSHOT.jar

## Endpoints

* GET http://localhost:8080/api/v1/person/
* POST http://localhost:8080/api/v1/person/ { "name": "Lucho Montes" }
* GET http://localhost:8080/api/v1/person/{_id}
* PUT http://localhost:8080/api/v1/person/{_id} { "name": "Lucho Figueroa" }
* DELETE http://localhost:8080/api/v1/person/{_id}