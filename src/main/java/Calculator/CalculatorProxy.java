package Calculator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Created by jzy on 2017/5/30.
 */
public class CalculatorProxy {
    private Calculator target;

    public CalculatorProxy(Calculator target)
    {
        this.target=target;
    }
    public Calculator getLoggingProxy(){

        Calculator proxy =null;
        //带来对象有哪一个类加载器加载
        ClassLoader loader =target.getClass().getClassLoader();
        Class [] interfaces =new Class[]{Calculator.class};

        InvocationHandler handler =new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                System.out.println("The method"+methodName+"begin with "+ Arrays.asList(args));
                //执行方法
                Object result =method.invoke(target,args);
                System.out.println("The method"+methodName+"end with "+ result);
                System.out.println("invoke....");
                return result;
            }
        };
        proxy = (Calculator)Proxy.newProxyInstance(loader,interfaces,handler);
        return  proxy;

















    }
}
