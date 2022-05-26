package lk.ijse.spring.bean;


import org.springframework.stereotype.Component;

@Component("a")
public class SpringBean01 {
    public SpringBean01() {
        System.out.println("Spring Bean 01 Instantiated");
    }
    public void test(){
        System.out.println("Test Method Invoked");
    }
}
