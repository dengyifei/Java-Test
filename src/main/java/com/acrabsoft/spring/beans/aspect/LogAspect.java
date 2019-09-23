package com.acrabsoft.spring.beans.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.acrabsoft.spring.beans.annotation.LOG;

/**
 * @desc
 *  AOP的概念: 切面、连接点、通知、切点
 * @author Administrator
 *
 */
@Component
@Aspect
public class LogAspect {
	 /*
     *定义一个方法,用于声明切点表达式,该方法一般没有方法体
     *@Pointcut用来声明切点表达式
     *通知直接使用定义的方法名即可引入当前的切点表达式 
     */
    @Pointcut("execution(* com.acrabsoft.spring.beans.service.*.*(..))")
    public void PointcutDeclaration() {}

    //前置通知,方法执行之前执行
    @Before("@annotation(com.acrabsoft.spring.beans.annotation.LOG) && @annotation(log)")
    public void BeforeMethod(JoinPoint jp,LOG log) {    
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("BeforeMethod  The method   "+ methodName +"   parameter is  "+ Arrays.asList(args));
        System.out.println(log.operation()+"add before \n");
    }

    //后置通知,方法执行之后执行(不管是否发生异常)
    @After("PointcutDeclaration()")
    public void AfterMethod(JoinPoint jp) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("AfterMethod  The method    "+ methodName +"   parameter is  "+Arrays.asList(args));
    }

    //返回通知,方法正常执行完毕之后执行
    @AfterReturning(value="PointcutDeclaration()",returning="result")
    public void AfterReturningMethod(JoinPoint jp,Object result) {
        String methodName = jp.getSignature().getName();
        Object[] args = jp.getArgs();
        System.out.println("AfterReturningMethod  The method   "+ methodName +"   parameter is  "+Arrays.asList(args)+" "+result);
    } 
    
    

//	@Around("PointcutDeclaration()")
//	public Object execute(ProceedingJoinPoint joinPoint) throws Throwable {
//		
//	}
    //异常通知,在方法抛出异常之后执行
    @AfterThrowing(value="PointcutDeclaration()",throwing="e")
    public void AfterThrowingMethod(JoinPoint jp,Exception e) {
        String methodName = jp.getSignature().getName();
        System.out.println("AfterThrowingMethod  The method   "+ methodName +"exception :"+e);
    }

}
