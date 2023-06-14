# DigitalNetwork Spring Boot Project

Welcome to the DigitalNetwork Spring Boot project! This project aims to demonstrate 
the basic functionaliy and structure of a Spring Boot application.

## Disclaimer

1.  This code is not original and was developed by following instructions from the Udemy course
 **"Master Microservices with Spring Boot and Spring Cloud"**.
2. This repository contains code that was developed by following the instructions from the
**"Master Microservices with Spring Boot and Spring Cloud"** by Ranga Karanam, the founder of *in28minutes*. 
3. The course covers various topics related to  REST WEB SERVICES with Spring Boot, and it spans 22 hours on-demand video.
4. In some cases, modifications or adaptations have been made to the original code to fit specific requirements
or enhance functionality.
5. To access the original course materials and learn more, please refer to the
**"Master Microservices with Spring Boot and Spring Cloud"**. available
here (https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/)

## Project Structure

The project consists of the following files:

1. DigitalNetworkApplication.java: This file serves as the entry point for the Spring Boot application.It contains the main
method that starts the application.
2. HelloBean.java: This file defines the HelloBean class, which represents a simple bean that can be used within the application.
3. HelloController.java: This file contains the HelloController class, which serves as a RESTful controller
for handling HTTP requests. It provides endpoints for handling various HTTP methods and interacts with the application's services.
4. User.java: This file defines the User class, which represents a user entity within the application. It contains attributes and 
 methods related to user information.
5. UserDaoService.java: This file contains the UserDaoService class, which acts as a data access object (DAO) for managing user data.
It provides methods for CRUD operations (Create, Read, Update, Delete) on the User objects.
6. UserResource.java: This file defines the UserResource class, which serves as a RESTful controller for managing user-related HTTP requests.
It interacts with the UserDaoService to perform operations on the user data.
