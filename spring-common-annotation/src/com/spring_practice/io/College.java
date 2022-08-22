package com.spring_practice.io;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean") // another way to creating bean

public class College {
	
	
	private String collgeName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("scienceTeacher")
	private Teacher teacher;
	
	
	/*
	 * public College(Principal principal) { this.principal = principal; }
	 */
	
	/*
	 * @Autowired public void setPrincipal(Principal principal) { this.principal =
	 * principal; System.out.println("using SetPrincipal method"); }
	 * 
	 * @Autowired public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * }
	 */
	@Required
	/* @Value("${college.Name}") */
	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	}


	public void setPrincipal(Principal principal) {
		this.principal = principal;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public void test() {
		teacher.teach();
		principal.pricipalInfo();
		System.out.println("My college Name :"+collgeName);
		System.out.println("Testing this call method");
	}

}
