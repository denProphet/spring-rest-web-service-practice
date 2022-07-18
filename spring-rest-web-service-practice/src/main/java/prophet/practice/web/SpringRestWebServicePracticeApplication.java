package prophet.practice.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Simple Rest Web Service
 * Use Postman
 *
 * Examples of requires:
 * localhost:8080/client?id=1  ==> add customer
 * localhost:8080/client?id=1&name=petya  ==> get customer
 *
 * */
@SpringBootApplication
public class SpringRestWebServicePracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRestWebServicePracticeApplication.class, args);
    }

}
