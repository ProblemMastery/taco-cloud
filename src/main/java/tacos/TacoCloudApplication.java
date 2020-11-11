package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**
 * The above annnotation is composed of 3 annotations designates this class as a configuration class. It composed of
 * @SpringBootConfiguration, 					 @EnableAutoConfiguration 		@ComponentScan
 * |->Designates class as a configuration class   enables automatic config		enables component scanning, lets us name classes with @component- spring discovers them
 */
public class TacoCloudApplication {

	public static void main(String[] args) {

		/*
		performs actual bootstrapping of the application, creatig spring application context
		 */
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
