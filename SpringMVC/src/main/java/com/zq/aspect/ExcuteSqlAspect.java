package com.zq.aspect;

import org.aspectj.lang.annotation.*;

@Aspect
public class ExcuteSqlAspect {
//    @Pointcut(value="execution(* com.zq.dao.UserDao.get*(String))&&args(name)")
    @Pointcut(value = "execution(* com.zq.controller.MainController.*(..))")
    public void point(){}
    @Before(value = "point()")
    public void Before(){
        System.out.println("执行index方法之前");
    }
    @AfterReturning(value = "point()")
    public void after(){
        System.out.println("执行index方法结束");
    }


}
