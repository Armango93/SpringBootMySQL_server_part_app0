# SpringBootMySQL_server_part_app0

## SpringBootMySQL_server_part_app0 is a server part of a microservice application, uses SpringBoot, MySql database.

This server part of application is deployed on Heroku and has base url address - https://spring-boot-mysql-server-part0.herokuapp.com .
User or client part of application can use this address with adding part of url, which determined for every of available methods in this server.
Methods are accessible to apply:
* getAllBooks() - use with adding "/api/books/" to base url and through GET request
* createBook(@Valid @RequestBody Book book) - use with adding "/api/books/create/" to base url and through POST request, also put object Book to be added(JSON type) into the body of request.
* getBook(@PathVariable("id") Long id) - use with adding "api/books/{id}" to base url and through GET request with unique id for Book you want to get.
* updateBook(@PathVariable("id") Long id, @RequestBody Book book) - use with adding "api/books/{id}" to base url and through PUT request with unique id and new values in the body of request for Book you want to update.
* deleteBook(@PathVariable("id") Long id) - use with adding "api/books/{id}" to base url and through DELETE request with unique id for Book you want to delete.

![alt](https://image.ibb.co/eQYk5p/spring_boot_mysql_server_in_postman.jpg)
