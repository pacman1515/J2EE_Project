package com.zq.aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectTest {
    @Pointcut(value="execution(* com.zq.bean.BeanTest.Display(..))")
    public void point(){

    }
    @Before(value="point()")
    public void Before(){
        System.out.println("BeanTest begin");
    }
    @AfterReturning(value = "point()")
    public void After(){
        System.out.println("BeanTest Complete");
    }
}
