package com.godigit.javaconfig.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig1.class);
		JavaConfig0 javaConfig= context.getBean("javaConfig",JavaConfig0.class);
		javaConfig.showInfo();
	}
}
