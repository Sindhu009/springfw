package com.xworkz.custom.tester;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TesterCustomer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("resourse/spring-Module.xml");

		CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
		Customer customer = new Customer(1, "sindhu", 23);
		customerDAO.insert(customer);

		Customer customer1 = customerDAO.findByCustomerId(1);
		System.out.println(customer1);

	}

}
