package com.godigit.javaconfig.withoutxml;
	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;



	@Configuration   //configure own java class
	  
	@ComponentScan(basePackages="com.godigit.javaconfig.withoutxml;")
	//Scans the bean to be injected

	public class JavaConfig1  {
	    @Bean
	    public void showInfo() {
	        System.out.println("Water is transparent in colour");
	        
	    }
	}
