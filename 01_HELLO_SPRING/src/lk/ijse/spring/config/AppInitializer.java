package lk.ijse.spring.config;

import lk.ijse.spring.bean.DBConnection;
import lk.ijse.spring.bean.SpringBean03;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext();
        ctx.registerShutdownHook();
        ctx.register(AppConfig.class);
        ctx.refresh();
//        SpringBean01 bean1 = ctx.getBean(SpringBean01.class);
//        SpringBean02 bean2 = ctx.getBean(SpringBean02.class);
//        bean1.test();
//        bean2.test();

//        SpringBean01 springBean01 = (SpringBean01) ctx.getBean("a");
//        System.out.println(springBean01);
//        SpringBean02 springBean02 = (SpringBean02) ctx.getBean("springBean02");
//        System.out.println(springBean02);

//        DBConnection dBConnection = (DBConnection) ctx.getBean("dBConnection");
//        System.out.println(dBConnection);
//        DBConnection dBConnection1 = (DBConnection) ctx.getBean("dBConnection");
//        System.out.println(dBConnection1);
    }
}
