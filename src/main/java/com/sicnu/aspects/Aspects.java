package com.sicnu.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.util.Date;

@Aspect
public class Aspects {
    @Before("execution(* com.sicnu.services.Student.GetDe*(..))")
    public void BeforeAdvice(){
        System.out.println("这是一个前置通知");
    }
    @Around("execution(* com.sicnu.services.Student.Service1(..))")
    public Object AroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("当前时间"+new Date());
        Object proceed = pjp.proceed();
        System.out.println("在业务方法之后的增强");
        return proceed;
    }
}
