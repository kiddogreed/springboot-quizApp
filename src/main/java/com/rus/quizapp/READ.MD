1. Create Controller class name depends on its purpose
2. add @RestController annotation to it
3. add @GetMapping annotation with (("url/endpoints"))
4. create getAll<name of object to return> method with return



Configuration of the JPA DRIVERS
1. in application.properties add the following:
    
   spring.datasource.driver-class-name=org.postgresql.Driver
   spring.datasource.url=jdbc:postgresql://localhost:5432/questiondb
   spring.datasource.username=postgres
   spring.datasource.password=russelle0
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

2. Create Service layer