# SpringBootH2RestAPI - Project

## H2 db
This properties will be used when the server start (please add it at 'Environment variables')

* url=jdbc:h2:mem:testdb
* driverClassName=org.h2.Driver
* username=sa
* password=
* spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

## How to test
Using PostMan

* Run The MainApplication class as java application 
* URL of Rest API: http://localhost:8080/api/product
* Three Paramters: 
   date:2020-06-14-10.00.00
   productId:35455
   brandId:1
 

