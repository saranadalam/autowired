package com.ls.example.usingthreebeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		ApplicationContext cxt= new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 bean=(Bean1) cxt.getBean("bean");
		
		System.out.println(bean);
		
	}
}
