package guru.springframework;

import guru.springframework.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);

		System.out.println(context.getBean(GreetingController.class).sayHello());
	}
}
