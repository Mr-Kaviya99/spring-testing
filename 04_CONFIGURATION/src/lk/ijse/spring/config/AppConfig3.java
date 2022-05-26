package lk.ijse.spring.config;

import lk.ijse.spring.bean.SpringBean3;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {
    @Bean
    public SpringBean3 springBean3(){
        return new SpringBean3();
    }
}
