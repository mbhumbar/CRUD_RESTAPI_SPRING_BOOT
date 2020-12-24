# CRUD_RESTAPI_SPRING_BOOT
## Creating CRUD Web Application using Sping Boot Rest API 

## here step by step i'm explining how to create crud application in the spring boot 

- create project from [spring boot starter]
- add three depenedncy in the project 
    - spring web 
    - mysql driver
    - spring Data JPA 
- import project in your favirate IDE 
- update project - right click on your project -> maven-> update Maven
- for creating rest api we need 
    - Controller
    - Service class
    - DAO
    - Model Class  
- create package and classes for above component 
- create database for performing operaration
- open application.properties file and update your database name, username and database and pasword 

```
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/myhiber
spring.datasource.username=root
spring.datasource.password=root
```
- update the project and run the project table will automatically created in your database 
- for api tesing download and run the postman client and test the api 
    -  Create Course(POST Method) -> localhost:8081/courses/
    -  update Course(PUT Method) -> localhost:8081/courses/
    -  delete Course(DELETE Method)  -> localhost:8081/courses/{courseId}
    - getall Courses(GET)  -> localhost:8081/courses/getAllCourses


