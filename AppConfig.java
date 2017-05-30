package com.luv2code.aopapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

// Spring Configuration Annotations in Java

/**
 * @author anupama
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.luv2code.aopapp")
public class AppConfig {
	

}
