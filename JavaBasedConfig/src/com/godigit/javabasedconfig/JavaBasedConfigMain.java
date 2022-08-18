package com.godigit.javabasedconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaBasedConfigMain {

	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
JavaBasedConfig1 javaConfig=context.getBean("java",javaBasedConfig1.class);
System.out.Println(javaConfig);
	}

}
