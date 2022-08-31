package spring.training.SpringTraining;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@OpenAPIDefinition(info =@Info(title = "Spring Training API Doc"))
@EnableFeignClients
public class SpringTrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTrainingApplication.class, args);
	}

}
