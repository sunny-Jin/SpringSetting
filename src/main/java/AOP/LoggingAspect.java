package AOP;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jzy on 2017/5/30.
 */
//把这个类声明为一个切面：需要将该类放入IOC容器中，再声明一个切面
    @Aspect
    @Component
public class LoggingAspect {

    //声明该方法是一个前置通知：在目标方法开始之前执行
    @Before("execution(public int AOP.Calculator.*(int,int))")
    public void beforeMethod(JoinPoint joinPoint)
    {
        String methodName=joinPoint.getSignature().getName();
        List<Object> args= Arrays.asList(joinPoint.getArgs());
        System.out.println("The method "+methodName+" begins:"+args);
    }
}
