package com.spring_practice.io;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans.xml file loaded");
		College college = context.getBean("collegeBean", College.class);
		System.out.println("College object is created by spring"+college);

	}

}
