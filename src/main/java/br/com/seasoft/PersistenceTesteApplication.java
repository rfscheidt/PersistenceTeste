package br.com.seasoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersistenceTesteApplication {

	private static final Logger log = LoggerFactory.getLogger(PersistenceTesteApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(PersistenceTesteApplication.class, args);
	}

}
