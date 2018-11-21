package com.gdc.spring.aop.springaop.Aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @AfterReturning(
            value = "com.gdc.spring.aop.springaop.Aspect.CommonJoinPointConfig.businessLayerExecution()",
            returning="result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result){
        logger.info("{} returned with value {}", joinPoint, result);
    }

    @AfterThrowing(
            value = "com.gdc.spring.aop.springaop.Aspect.CommonJoinPointConfig.businessLayerExecution()",
            throwing="exception"
    )
    public void afterException(JoinPoint joinPoint, Object exception){
        logger.info("{} throw exception {}", joinPoint, exception);
    }

    @After(value="com.gdc.spring.aop.springaop.Aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint){
        logger.info("after execution of {}", joinPoint);
    }

}
