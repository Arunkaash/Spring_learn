package com.spring_practice.io;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am your science teacher");
		System.out.println("My name is Salendra");

	}

}
