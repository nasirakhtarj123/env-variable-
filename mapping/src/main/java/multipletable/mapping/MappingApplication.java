package multipletable.mapping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MappingApplication {

    public static void main(String[] args) {
        loadEnvVariables();
        SpringApplication.run(MappingApplication.class, args);
    }

    private static void loadEnvVariables() {
        // Specify the path to the .env file
        String envFilePath = "mappingCompleted\\mapping\\src\\main\\java\\multipletable\\mapping\\config\\.env";

        // Load environment variables from the specified file path
        Dotenv dotenv = Dotenv.configure().filename(envFilePath).load();

        // Set your environment variables here
        System.setProperty("spring.datasource.username", dotenv.get("DB_USERNAME"));
        System.setProperty("spring.datasource.password", dotenv.get("DB_PASSWORD"));
        System.setProperty("spring.datasource.url", dotenv.get("DB_URL"));
        // Add more properties as needed
    }
}
