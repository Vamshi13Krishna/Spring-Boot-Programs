package com.venom.springex.SpringJavaBaseConfigEx2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonConfig {
	@Bean
	public Person PersonInfo() {
		Person person1=new Person();
		person1.setName("VENOM");
		person1.setEmail("venomthunder@gmail.com");
		return(person1);

}
}
