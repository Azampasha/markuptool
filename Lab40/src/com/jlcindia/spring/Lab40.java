package com.jlcindia.spring;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab40 {

	public static void main(String[] args) {
	// comment test comment123
		
		// Azam pasha Nargund  
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		TestBean tb=(TestBean)ctx.getBean("testBean");
		tb.showEnglish();
		//tb.showHindi();

	}

}
