Basic HATEOAS http calls webservice built using Spring-RS, without xml using reference
mapped using @RestController, @Service
Uses JpaRepository 
If you provide a dependency to spring-boot-starter-data-jpa in pom.xml with no other config, JPA/Hibernate uses an in-memory H2 database 
             
GET
	localhost:8080/books
	localhost:8080/books/4
POST
{
	"id":4,
	"name":
	"Spring REST tutorials",
	"author":"mkyong",
	"price":9.99
}
PUT
{
	"id":4,
	"name":"Spring Forever",
	"author":"pivotal",
	"price":9.99
}

DELETE
	localhost:8080/books/4
	
	
Setup
404 - Not Found  Controller not getting detected with package structure correctly placed i.e Application is above controller
	Moved controller to same folder as application
required a bean of type 'com.service.IConfigurationService' that could not be found
	Added @ComponentScan(basePackages = "com.service")