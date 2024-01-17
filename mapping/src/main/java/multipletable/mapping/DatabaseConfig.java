// package multipletable.mapping;
// import io.github.cdimascio.dotenv.Dotenv;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;

// @Configuration
// public class DatabaseConfig {

//     @Value("${DATABASE_URL}")
//     private String databaseUrl;

//     @Value("${USERNAME}")
//     private String username;

//     @Value("${PASSWORD}")
//     private String password;

//     @Bean
//     public DataSource dataSource() {
//         // Use the variables to configure your DataSource
//         // Example: DriverManagerDataSource or any other DataSource implementation
//         DriverManagerDataSource dataSource = new DriverManagerDataSource();
//         dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//         dataSource.setUrl(databaseUrl);
//         dataSource.setUsername(username);
//         dataSource.setPassword(password);
//         return dataSource;
//     }

//     // Add other configuration methods or beans as needed
// }