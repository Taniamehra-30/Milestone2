package com.godigit.withXml;
	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	public class FinalChecker {
	   public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

	      TextChange te = (TextChange) context.getBean("textChange");
	      te.getSpellChecker();
	}
}
