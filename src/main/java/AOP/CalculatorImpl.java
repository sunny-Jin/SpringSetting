package AOP;

import org.springframework.stereotype.Component;

/**
 * Created by jzy on 2017/5/30.
 */
@Component //将方法加入容器
public class CalculatorImpl implements Calculator {
    public int add(int i, int j) {
        return i+j;
    }

    public int sub(int i, int j) {
        return i-j;
    }

    public int mul(int i, int j) {
        return i*j;
    }

    public int div(int i, int j) {
        return i/j;
    }
}
