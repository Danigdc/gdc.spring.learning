package com.gdc.spring.aop.springaop.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
    @Pointcut("execution(* com.gdc.spring.aop.springaop.Business.*.*(..))")
    public void businessLayerExecution(){}

    @Pointcut("within(com.gdc.spring.aop.springaop.Business..*)")
    public void businessLayerExecutionWithWithin(){}

    @Pointcut("bean(*dao*)")
    public void beanContainingDao(){}

    @Pointcut("@annotation(com.gdc.spring.aop.springaop.Aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
