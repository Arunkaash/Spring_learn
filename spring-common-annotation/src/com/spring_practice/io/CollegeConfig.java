package com.spring_practice.io;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
 @ComponentScan(basePackages="com.spring_practice.io") 
@PropertySource("classpath:college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean public Principal principalBean() { return new Principal(); }
	 * 
	 * @Bean public Teacher mathTeacherBean() { return Teacher(); // for interface
	 * we cannot create a object we create obj of implementing class return new
	 * MathTeacher(); }
	 * 
	 * @Bean
	 * 
	 * @Bean(name = {"colBean", "colBeanAnother"}) //we can pass multiple bean name
	 * public College collegeBean() { College college = new College();
	 * college.setPrincipal(principalBean()); college.setTeacher(mathTeacherBean());
	 * return college; // return college object
	 * 
	 * }
	 */
}
