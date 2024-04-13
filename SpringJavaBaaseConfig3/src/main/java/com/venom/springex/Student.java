package com.venom.springex;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	private Emailservice emailservice;
	@Autowired
	private JavaCourseService javacourseService;
	

	public void details() {
		emailservice.message();
		javacourseService.CourceInfo();
	

	}
}
