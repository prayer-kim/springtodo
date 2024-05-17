package kr.re.kitri.hellogram;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class HellogramApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellogramApplication.class, args);
	}

}
