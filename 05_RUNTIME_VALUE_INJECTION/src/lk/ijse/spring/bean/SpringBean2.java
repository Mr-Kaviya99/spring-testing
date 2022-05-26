package lk.ijse.spring.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    public SpringBean2(@Value("001")int iD,@Value("Kasun,Ruwan,Thuhee")String name[]) {
        for (String names : name) {
            System.out.println( iD+" "+names);
            iD=iD+1;
        }
    }
}
