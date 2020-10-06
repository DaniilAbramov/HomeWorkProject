package hw.itsjava.logging;

import lombok.SneakyThrows;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Aspect;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(* hw.itsjava.CoffeeService.*(..))")
    public void logBefore(JoinPoint joinpoint) {
        System.out.println("before");
        System.out.println(joinpoint.getThis().getClass());
    }

    @After("execution(* hw.itsjava.CoffeeService.*(..))")
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("Спасибо за ваш выбор!");
    }

    @SneakyThrows
    @Around("execution(* hw.itsjava.CoffeeService.*(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) {
        System.out.println("Before "  + proceedingJoinPoint.getTarget().getClass());
        Object res = proceedingJoinPoint.proceed();

        System.out.println("After " + proceedingJoinPoint.getTarget().getClass());
        return res;
    }
}
