package one.digitalinnovation.lab.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto gerado via Spring initilzr
 * Modulos:
 * - Spring Data JPA;
 * - Spring Web;
 * - H2 DATABASE;
 * - OpenFeign
 */
@SpringBootApplication
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
