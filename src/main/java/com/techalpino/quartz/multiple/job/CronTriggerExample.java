/**
 * 
 */
package com.techalpino.quartz.multiple.job;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author Rinku Vats
 *
 */
public class CronTriggerExample {

	public static void main(String[] args) throws Exception {
		String cronTime = "0/20 * * * * ?" ;
		String cronTimeNew = "0/10 * * * * ?" ;
		int i = 1 ;
		while(i<3){
		JobKey jobKeyA = new JobKey("jobA"+i, "group1"+i);
		JobDetail jobA = JobBuilder.newJob(JobA.class).withIdentity(jobKeyA)
				.build();
		Trigger trigger1 = null ;
	/*	JobKey jobKeyB = new JobKey("jobB", "group1");
		JobDetail jobB = JobBuilder.newJob(JobB.class).withIdentity(jobKeyB)
				.build();

		JobKey jobKeyC = new JobKey("jobC", "group1");
		JobDetail jobC = JobBuilder.newJob(JobC.class).withIdentity(jobKeyC)
				.build();*/
// JOB schdeduling  class name/Job Name and group Name cronTime  
		
		
	   if(i%2 == 0 ){
		   System.out.println("I is "+i +" and cron is "+cronTime);
		trigger1 = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName1"+i, "group1"+i)
				.withSchedule(CronScheduleBuilder.cronSchedule(cronTime))
				.build();
	   }
	   else {
		   trigger1 = TriggerBuilder
					.newTrigger()
					.withIdentity("dummyTriggerName1"+i, "group1"+i)
					.withSchedule(CronScheduleBuilder.cronSchedule(cronTimeNew))
					.build();
		   System.out.println("I is "+i +" and cron is "+cronTimeNew);
	   }
	   
		
/*
		Trigger trigger2 = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName2", "group1")
				.withSchedule(CronScheduleBuilder.cronSchedule(cronTime))
				.build();

		
		Trigger trigger3 = TriggerBuilder
				.newTrigger()
				.withIdentity("dummyTriggerName3", "group1")
				.withSchedule(CronScheduleBuilder.cronSchedule(cronTime))
				.build();
*/
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();

		scheduler.start();
		//scheduler.r
		scheduler.scheduleJob(jobA, trigger1);
		System.out.println("Thread is going to sleep for 10 sec for i "+i);
		Thread.sleep(10000);
		System.out.println("Total Jobs "+scheduler);
		i++;
		
		}
	//	scheduler.shutdown(true);
	/*	scheduler.scheduleJob(jobB, trigger2);
		scheduler.scheduleJob(jobC, trigger3);*/

	}
}
