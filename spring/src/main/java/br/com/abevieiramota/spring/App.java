package br.com.abevieiramota.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"br/com/abevieiramota/spring/spring.xml")) {

			Ab ab = (Ab) ctx.getBean("ab");
			System.out.println(ab);
		}
	}
}
