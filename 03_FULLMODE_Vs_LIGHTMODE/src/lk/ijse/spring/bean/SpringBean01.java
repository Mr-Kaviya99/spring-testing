package lk.ijse.spring.bean;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("a")
public class SpringBean01 {
    public SpringBean01() {
        System.out.println("Spring Bean 01 Instantiated");
    }

    //    Light Mode
    @Bean
    public SpringBean02 springBean02() {
        SpringBean03 springBean01 = springBean03();
        SpringBean03 springBean02 = springBean03();
        System.out.println(springBean01);
        System.out.println(springBean02);
        return new SpringBean02();
    }

    @Bean
    public SpringBean03 springBean03() {
        return new SpringBean03();
    }
}
