package br.com.chapter.livelo.demofeigncliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class DemoFeignClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoFeignClienteApplication.class, args);
	}

}
