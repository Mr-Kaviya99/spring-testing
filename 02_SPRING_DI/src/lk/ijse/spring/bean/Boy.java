package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy {

    @Autowired
    GoodGirl girl;

    public void chaWithGirl(){
        System.out.println("Hello Girl");
        girl.chat();
    }
}
