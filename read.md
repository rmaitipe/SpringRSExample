Basic http calls webservice built using Spring-RS, extending JpaRepository, without xml references
mapped using @RestController, @Service annotations
@ControllerAdvice/@RestControllerAdvice in a class that extends ResponseEntityExceptionHandler for Exception handling 
using @ExceptionHandler

MapStruct
//https://www.baeldung.com/mapstruct https://reflectoring.io/java-mapping-with-mapstruct/
We only need to provide the interface with @Mapper annotation, The implementation is generated at the runtime.
If field names are same no additional work is required, else create a converter method.
(If lombok is used you might encounter - https://stackoverflow.com/questions/38162941/unknown-property-in-a-return-type)
DefaultExpressions to handle null values and some type conversions are supported.

If you provide a dependency to spring-boot-starter-data-jpa in pom.xml with no other config, JPA/Hibernate uses an in-memory H2 database 
             
GET localhost:8080/books localhost:8080/books/4
POST {
	"id":4,
	"name":
	"Spring REST tutorials",
	"author":"mk",
	"price":9.99
}
PUT {
	"id":4,
	"name":"Spring Forever",
	"author":"pivotal",
	"price":9.99
}
DELETE localhost:8080/books/4

Setup
404 - Not Found  Controller not getting detected with package structure correctly placed i.e Application is above controller
	Moved controller to same folder as application
required a bean of type 'com.service.IConfigurationService' that could not be found
	Added @ComponentScan(basePackages = "com.service")

Swagger support
https://www.baeldung.com/spring-rest-openapi-documentation
http://localhost:8080/swagger-ui.html
