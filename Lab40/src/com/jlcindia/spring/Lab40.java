package com.jlcindia.spring;


import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab40 {

	public static void main(String[] args) {
	// developer2 comment
	ApplicationContext ctx=new ClassPathXmlApplicationContext("jlcindia.xml");
		TestBean tb=(TestBean)ctx.getBean("testBean");
		tb.showEnglish();
		//tb.showHindi();

	}

}
