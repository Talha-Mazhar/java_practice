package com.example.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //You have to specify all, return type, class-name.method-name(args)

//    @Before("execution(* *.*(..))")

//    @Before("execution(* com.example.JobApp).service.JobService.*(..)")

//    @Before("execution(* com.example.JobApp).service.JobService.updateJob(..)")

    @Before("execution(* com.example.JobApp).service.JobService.updateJob(..) || execution(* com.example.JobApp).service.JobService.addJob(..)")
    public void logMethodCall(JoinPoint jp) {
        LOGGER.info("Method Called" + jp.getSignature().getName());
    }

    @After("execution(* com.example.JobApp).service.JobService.updateJob(..) || execution(* com.example.JobApp).service.JobService.addJob(..)")
    public void logMethodExecuted(JoinPoint jp) {
        LOGGER.info("Method Executed" + jp.getSignature().getName());
    }
    @AfterThrowing("execution(* com.example.JobApp).service.JobService.updateJob(..) || execution(* com.example.JobApp).service.JobService.addJob(..)")
    public void logMethodCrash(JoinPoint jp) {
        LOGGER.info("Method has some issues" + jp.getSignature().getName());
    }

    @AfterReturning("execution(* com.example.JobApp).service.JobService.updateJob(..) || execution(* com.example.JobApp).service.JobService.addJob(..)")
    public void logMethodExecutedSuccess(JoinPoint jp) {
        LOGGER.info("Method has returned success" + jp.getSignature().getName());
    }

}
