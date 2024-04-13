package com.venom.springex;

import org.springframework.stereotype.Component;

@Component
public class Emailservice  implements MessageService{

	@Override
	public void message() {
		System.out.println("its time to blast for 2024IPL");
		
	}

}
