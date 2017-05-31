package AOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jzy on 2017/5/30.
 */
public class CalculatorTest {
    public static void main(String args[])
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("Aop.xml");
        Calculator calculator = ctx.getBean(Calculator.class);
        int result = calculator.add(3, 6);
        System.out.println("result "+result);

        result = calculator.div(6, 6);
        System.out.println("result "+result);

    }
}
