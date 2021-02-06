package com.xworkz.projector;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.ball.Ball;
import com.xworkz.country.Country;
import com.xworkz.projector.custom.Projector;

public class SpringTester {
	public static void main(String args[]) {

		String ref = "fw/spring.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(ref);

		System.out.println(spring.getBeanDefinitionCount());

//		Projector projector = spring.getBean(Projector.class);
//		System.out.println(projector);
		
		Ball ball = spring.getBean(Ball.class);
		System.out.println(ball);
//		Country country = spring.getBean(Country.class);
//		System.out.println(country);
//
//
		
		
		
//
	}

}
