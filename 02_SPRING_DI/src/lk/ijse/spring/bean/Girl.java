package lk.ijse.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class Girl implements GoodGirl {
    public void chat(){
        System.out.println("Hello Boy");
    }
}
