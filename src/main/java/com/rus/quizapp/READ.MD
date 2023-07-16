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

2. Organizing layers
   create  model package for entity layers where we define the column
   create dao package to fetch data (repositories)
   create controller package where we handle request from REST
   create service layer where we handle the logic

3. In model package<br>
   @Data
   @Entity
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

*REST ARCHITECTURE*

 1. fetch all(GET ALL) 200 ok || 404 NotFound
   - create  fetch method which return list in controller 
   - use  @GetMapping("allTest")  annotation
   - extend dao as interface in service using jpa repository 
   - create method in service layer
   - create handle exceptions use try catch
   - in controller call the created method from service
   - make sure to return proper HTTPResponse (status,message,code,format)
   - ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK)
 2. fetch one(GET BY columns)200 ok  || 404 NotFound
   - create  get method in controller ex. getbyid
   - use  @GetMapping("test/{id}")  annotation
   - add @PathVariable annotation  in parameters
   - create method in Dao with type of return
   - use the dao method in service layer
   - create handle exceptions use try catch
   - in controller call the created method from service
   - make sure to return proper HTTPResponse (status,message,code,format)
   - ResponseEntity<>(questionService.getAllQuestions(), HttpStatus.OK)
 3. Create/add (POST )201 created || 204 No Content
   - create add method in controller  ex.addData /createUser
   - use @PostMapping("addData")
   - use @RequestBody in parameters
   - in service layer use dao builtin method save
   - create handle exceptions use try catch
   - from controller call the created method from service 
   - make sure to return proper HTTPResponse (status,message,code,format)

 4. Update/edit (patch/put)200 ok  || 204 No Content || 202 accepted
 5. Delete/destroy (delete) 200 ok || 204 No Content || 202 accepted