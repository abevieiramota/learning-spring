package br.com.abevieiramota.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.abevieiramota.spring.model.BasicPlayer;

/**
 * instanciado e utilizando um ApplicationContext 
 */
public class App {
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"br/com/abevieiramota/spring/spring.xml")) {

			BasicPlayer ab = (BasicPlayer) ctx.getBean("basicPlayer");
			System.out.println(ab);
		}
	}
}
