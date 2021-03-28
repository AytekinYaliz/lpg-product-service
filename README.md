# lpg-product-service

- clone or download the repository on to your local machine
- from a terminal run the following command
```
  ./mvnw clean install
  ./mvnw spring-boot:run -Dspring-boot.run.arguments=--spring.profiles.active=local
```
The application:
- will run on http://localhost:8080
- will connect to H2 embedded db locally


