package flapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		System.out.println("starting the app...");
		
		ApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		//force a quit
		System.out.println("forcing a quit...");
		System.exit(1);
		
		
	}

}
