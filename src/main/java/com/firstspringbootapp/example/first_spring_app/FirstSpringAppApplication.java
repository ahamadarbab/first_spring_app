package com.firstspringbootapp.example.first_spring_app;

import com.firstspringbootapp.example.first_spring_app.model.Address;
import com.firstspringbootapp.example.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
public class FirstSpringAppApplication {

	public static void main(String[] args) {

		SpringApplication.run(FirstSpringAppApplication.class, args);
		System.out.println("Hello all, welcome to first Spring Boot app!!");

		// tight coupling example

//		Employee emp1 = new Employee();
//		emp1.id = 123;
//		emp1.name = "Ajay k";
//		emp1.email = "ajayk@gmail.com";
//		emp1.designation = "developer";
//
//		Address adrs1 = new Address();
//		adrs1.doorNo = 203;
//		adrs1.streetName = "old street";
//		adrs1.city = "old city";
//		adrs1.state = "old state";
//		adrs1.pinCode = 112233;
//
//		emp1.address = adrs1;
//		System.out.println("emp1 is : " + emp1);
//		System.out.println("adrs1 is : " + adrs1);
//
//		adrs1.doorNo = 501;
//		adrs1.streetName = "new street";
//		adrs1.city = "new city";
//		adrs1.state = "new state";
//		adrs1.pinCode = 110066;
//
//		System.out.println("emp1 after adrs1 change is : " + emp1);
//		System.out.println("adrs1 after adrs1 change is : " + adrs1);

		// Dependency injection - loose coupling example with setter injection

		Employee emp2 = new Employee();
		emp2.setId(234);
		emp2.setName("Vijay k");
		emp2.setEmail("vijayk@gmail.com");
		emp2.setDesignation("tester");

		Address adrs2 = new Address();
		adrs2.setDoorNo(333);
		adrs2.setStreetName("old street");
		adrs2.setCity("old city");
		adrs2.setState("old state");
		adrs2.setPinCode(112244);

		emp2.setAddress(adrs2);

		System.out.println("emp2 is : " + emp2);
		System.out.println("adrs2 is : " + adrs2);

		emp2.getAddress().setDoorNo(666);
		emp2.getAddress().setStreetName("new street");
		emp2.getAddress().setCity("new city");
		emp2.getAddress().setState("new state");
		emp2.getAddress().setPinCode(110056);

		System.out.println("emp2 after adrs2 change is : " + emp2);
		System.out.println("adrs2 after adrs2 change is : " + adrs2);

		// Dependency injection - loose coupling example with constructor injection

		Address adrs3 = new Address(234, "old street", "old city", "old state", 110045);

		Employee emp3 = new Employee(345, "Rahul k", "rahulk@gmail.com", "tester", adrs3);

		System.out.println("emp3 is : " + emp3);
		System.out.println("adrs3 is : " + adrs3);

		emp3.getAddress().setDoorNo(567);
		emp3.getAddress().setStreetName("abc street");
		emp3.getAddress().setCity("new city");
		emp3.getAddress().setState("new state");
		emp3.getAddress().setPinCode(110056);

		System.out.println("emp3 after adrs3 change is : " + emp3);
		System.out.println("adrs3 after adrs3 change is : " + adrs3);
	}

}
