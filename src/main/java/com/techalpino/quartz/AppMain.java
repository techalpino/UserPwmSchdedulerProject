package com.techalpino.quartz;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
  
@PropertySource("classpath:application.properties")
public class AppMain {
     
	@Value("${server.port}")
	static String test ;
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String args[]){
        AbstractApplicationContext  context = new AnnotationConfigApplicationContext(AppConfig.class);
        
        System.out.println(test);
        
    }
 
}