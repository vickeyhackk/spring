package com.codedecode.microservices.EurekaServer;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EurekaServerApplicationTests {
	
    @BeforeAll
    public static void method1(){ System.out.println("This will be executed before all of the test method"); }

    @BeforeEach
    public void method2() { System.out.println( "This will be executed before Each Time of the test method");}


	@Test
	void contextLoads() {
		System.out.println("Success");
	}

	 @AfterAll
     public static void method3(){ System.out.println("This will be executed After all of the test method"); }

     @AfterEach
     public void method4() {
    	 System.out.println("This will be executed After Each line of the test method");
     }

}

