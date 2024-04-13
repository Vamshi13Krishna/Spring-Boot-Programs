package com.venom.springex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	@Bean
	public GreetingImp1 greets() {
		GreetingImp1 greetingImp1 = new GreetingImp1();
		return greetingImp1;
}
}

