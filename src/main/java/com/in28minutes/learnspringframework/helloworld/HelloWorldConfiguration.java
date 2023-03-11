package com.in28minutes.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//released in JDK 16
//Spring able to manage a custom class
//When a java class is created you need to 
//--create a constructor, getters, setters,equals, tostring, hashcode methods. To eliminate verbose, you can avoid all this by using a record 
record Person(String name,int age, Address address) {};//creates a construtor with name and age as arguments
record Address(String firstline, String city) {};
@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Nahida";
	}
	
	@Bean
	public int age() {
		return 15;
	}	
	@Bean
	public Person person() {
		return new Person("Ravi",20,new Address("Main Street", "Frisco"));
	}
	@Bean
	public Person person2MethodCall() {
		return new Person(name(),age(), address());
	}
	@Bean
	public Person person3Parameters(String name, int age, Address address3) {
		return new Person(name,age, address3);
	}	
	@Bean
	@Primary
	public Person person4Parameters(String name, int age, Address address) {
		return new Person(name,age, address);
	}
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier")Address address) {
		return new Person(name,age, address);
	}
	@Bean(name="address2")
	@Primary
	public Address address() {
		return new Address("3545 Stroll Road","Plano");
	}

	@Bean(name="address3")
	@Qualifier("address3qualifier")
	public Address address3() {
		return new Address("MOtinagar","Hyd");
	}
}
