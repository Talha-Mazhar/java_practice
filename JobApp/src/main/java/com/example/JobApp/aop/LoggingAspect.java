package com.example.JobApp.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
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

}
