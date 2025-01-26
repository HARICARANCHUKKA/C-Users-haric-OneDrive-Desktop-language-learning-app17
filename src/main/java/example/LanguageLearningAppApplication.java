package example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"example.model"}) // Specify the package containing your entities
public class LanguageLearningAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(LanguageLearningAppApplication.class, args);
    }
}
