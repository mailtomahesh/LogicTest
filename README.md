The base URL is http://localhost:8080/LogicTest/ if we are running on port 8080. 
Note: The port number is to be configured in the web server / application server.
This opens the default.jsp page which contains some help information regarding the URLs that can be accessed.

RESTful webservices are being used to implement the functionalities.
HTTP GET request is being used to implement the functionalities.
Note: In actual implementation, HTTP POST request can be used for better security etc.

The URL of Random Number Generation Service is the following:
http://localhost:8080/LogicTest/rest/RandomNumberService

Note 1: JSON string is output in the browser.
Note 2: The number of random numbers that are randomly generated is also generated randomly.This means that any number of numbers from 2 to 10 would get generated for addition. 
Note 3: The range of the numbers generated would be from 1 to 101.

A sample URL to access the Addition Result Check Service is the following:
http://localhost:8080/LogicTest/rest/AdditionResultService/97,64,41/202

This is actually in the format like the following:
http://localhost:8080/LogicTest/rest/AdditionResultService/{comma-separated-numbers}/{total}

JUnit tests are available for the following 2 conditions:
1) Provided total matches the total of the numbers.
2) Provided total does not match the total of the numbers.

Note: Spring Boot is not being used now for want of time.
Simple implementation using the Jersey framework has been done.
If I get more time, I can implement the functionalities again using Spring Boot.

Note: Eclipse was used for development.
