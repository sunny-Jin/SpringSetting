package Test;


import Service.InjectionService;
import ServiceImpl.HelloWorld;
import ServiceImpl.InjectionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jzy on 2017/5/28.
 */

public class TestInjection{

    public static void main(String args[])
    {
      //  InjectionServiceImpl injectionService = new InjectionServiceImpl();
      //  injectionService.save("hello");

//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.setName("金豆豆");
        //创建Spring的IOC容器对象
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        helloWorld.hello();
    }
}
