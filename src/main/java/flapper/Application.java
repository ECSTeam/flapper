package flapper;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		System.out.println("starting the app...");

		ApplicationContext ctx = SpringApplication.run(Application.class, args);

		Random r = new Random();

		int offset = r.nextInt(15) - 7;

		try {
			Thread.sleep(10000 + (1000 * offset));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		//force a quit
		System.out.println("forcing a quit...");
		System.exit(1);


	}

}
