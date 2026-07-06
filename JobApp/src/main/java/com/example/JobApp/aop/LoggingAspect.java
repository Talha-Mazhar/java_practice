package com.example.JobApp.aop;

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

    @Before("execution(* com.example.JobApp).service.JobService.*(..)")
    public void logMethodCall() {
        LOGGER.info("Method Called");
    }

}
