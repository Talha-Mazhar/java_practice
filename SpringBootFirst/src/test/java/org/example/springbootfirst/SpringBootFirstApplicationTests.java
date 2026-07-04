package org.example.springbootfirst;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootFirstApplicationTests {

   public static void main(String[] args) {
       SpringApplication.run(SpringBootFirstApplicationTests.class, args);
       System.out.println("Hello World");
   }
}
