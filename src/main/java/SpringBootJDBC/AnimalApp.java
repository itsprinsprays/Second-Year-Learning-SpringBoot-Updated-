package SpringBootJDBC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.github.prinsprays.springbootlearning", "SpringBootJDBC"})
public class AnimalApp {
	
	public static void main(String[] args) {
		SpringApplication.run(AnimalApp.class, args);
	}

}
