package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // ApplicationContext context = new AnnotationConfigApplicationContext(ATMConfig.class);
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
