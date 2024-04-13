package com.venom.springex;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseService implements CourseService{

	@Override
	public void CourceInfo() {
		
		System.out.println("java op or what");
	}

}
