# lpg-product-service

- clone or download the repository on to your local machine
- from a terminal run the following command
```
  ./gradlew clean build
  ./gradlew bootRun --args='--spring.profiles.active=local'
```
The application:
- will run on http://localhost:3001
- will connect to Atlas Mongo DB
- will have Swagger UI on  http://localhost:3001/swagger-ui/index.html