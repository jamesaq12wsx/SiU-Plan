package nccu.se.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProgram
{

    @SuppressWarnings("resource")
    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("nccu/se/di/beans-config.xml");
        RpgApplication application = (RpgApplication) context.getBean("application");
        application.run();
    }

}
