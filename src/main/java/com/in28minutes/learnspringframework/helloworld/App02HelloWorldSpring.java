package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
	//1.Launch a spring context
		/* using try with resources
		 * In this way when context is called, it will close automatically*/
		try(var context= 
				new AnnotationConfigApplicationContext
				(HelloWorldConfiguration.class);
				){
			
				//2.configure the things that we wan t spring framework to manage
					//HelloWorldConfiguration - @configuration
					//name - @Bean
				//3. Retrieving Beans managed by Spring
					System.out.println(context.getBean("name"));
					System.out.println(context.getBean("age"));
					System.out.println(context.getBean("person"));
					System.out.println(context.getBean("address2"));
					System.out.println(context.getBean(Person.class));		
					System.out.println(context.getBean(Address.class));
					System.out.println(context.getBean("person2MethodCall"));
					System.out.println(context.getBean("person3Parameters"));
					System.out.println("---------------------------");
					System.out.println(context.getBean("person4Parameters"));
					System.out.println(context.getBean("person5Qualifier"));
					//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;	

		}
		}

}
