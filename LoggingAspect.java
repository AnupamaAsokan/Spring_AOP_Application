package com.luv2code.aopapp.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author anupama
 * 
 */
@Aspect
@Component
public class LoggingAspect {

	//add advices for logging - @Before advice
	//Different point cut expressions
	//@Before("execution(public void com.luv2code.aopapp.dao.AccountDAO.addAcount())")
	//@Before("execution(public void add*())")
	
	//point cut expression for parameters
	//@Before("execution(* add*(com.luv2code.aopapp.Account, ..))")
	
	//point cut expression for packagename
	@Before("execution(* com.luv2code.aopapp.dao.*.*(..))")
	public void beforeAddAccountAdvice() {

		System.out.println("Executing beforeAddAccountAdvice---->>> ");
	}

}
