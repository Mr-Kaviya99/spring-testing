package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.spring")
public class AppConfig {

    @Bean
    public DBConnection dBConnection(){
        return new DBConnection();
    }
}
