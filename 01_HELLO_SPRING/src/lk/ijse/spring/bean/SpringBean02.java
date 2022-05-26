package lk.ijse.spring.bean;


import org.springframework.stereotype.Component;

@Component
public class SpringBean02 {
    public SpringBean02() {
        System.out.println("Spring Bean 02 Instantiated");
    }
    public void test(){

        System.out.println("Test Method 02 Invoked");
    }
}
