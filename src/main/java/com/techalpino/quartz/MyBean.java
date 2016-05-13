package com.techalpino.quartz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.techalpino.db.operations.TaskOperationImpl;
 
public class MyBean {
 
	
	 @Autowired
	 TaskOperationImpl taskOperationImpl ;
	
	final  String test = taskOperationImpl.getTasks().get(0).getExecutionTime() ;
	 
    @Scheduled(cron = "0 15 14 * * ?")
    public void printMessage() {
        System.out.println("I am called by Spring scheduler");
        
    }
    
}	