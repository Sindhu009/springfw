package com.xworkz.projector;


import java.util.ArrayList;
import java.util.ListIterator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.xworkz.ball.Ball;
import com.xworkz.country.Country;
import com.xworkz.countrylist.ArrayListConfig;
import com.xworkz.projector.custom.Projector;

public class SpringTester {
	public static void main(String args[]) {

//		String ref = "fw/spring.xml";
//		ApplicationContext spring = new ClassPathXmlApplicationContext(ref);
//
//		System.out.println(spring.getBeanDefinitionCount());

//		Projector projector = spring.getBean(Projector.class);
//		System.out.println(projector);
		
//		Ball ball = spring.getBean(Ball.class);
//		System.out.println(ball);
//		Country country = spring.getBean(Country.class);
//		System.out.println(country);
//
//
		
//		CountryList countrylist = spring.getBean(CountryList.class);
//		System.out.println(countrylist);
//		
		
		
		ApplicationContext spring = new FileSystemXmlApplicationContext("resouses/fw/spring.xml");
		ArrayListConfig  alistConfig = spring.getBean("countryList",ArrayListConfig .class);
        ArrayList<String> countryList = alistConfig.getCountryList();
        ListIterator<String> lIterator = countryList.listIterator();
        System.out.println("******************");
        while(lIterator.hasNext()){
              System.out.println(lIterator.next());
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//
	}

}
