package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    public SpringBean1(@Value("001")String iD,@Value("Kamal") String name) {
        System.out.println(iD+" "+name);
    }
}
