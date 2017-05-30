package Calculator;

/**
 * Created by jzy on 2017/5/30.
 */
public class CalculatorTest {
    public static void main(String args[])
    {
        Calculator target = new CalculatorImpl();
        Calculator proxy = new CalculatorProxy(target).getLoggingProxy();
       // CalculatorImpl calculator = new CalculatorImpl();
        proxy.add(1,2);
        proxy.sub(2,1);
        proxy.mul(1,2);
        proxy.div(2,1);
    }
}
