package com.techalpino.controller;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.JobKey;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.techalpino.quartz.multiple.job.JobA;
import com.techalpino.quartz.multiple.job.JobB;

@RestController
public class OperationController {

	@RequestMapping("/job/")
	public String schdeduleJob(@RequestParam String jobName,
			@RequestParam String groupName,
			@RequestParam String scheduleClassName) {
		String jobTime = null ;
	    try {
		JobDetail job = null;
		Trigger trigger = null;
		JobKey jobKey = new JobKey(jobName, groupName);
		if (scheduleClassName.equalsIgnoreCase("JobA")) {
			job = JobBuilder.newJob(JobA.class).withIdentity(jobKey).build();
			jobTime = "0/20 * * * * ?";
		} else {
			job = JobBuilder.newJob(JobB.class).withIdentity(jobKey).build();
			jobTime = "0/5 * * * * ?";
		}

		trigger = TriggerBuilder.newTrigger()
				.withIdentity("trigger" + jobName, "trigger" + groupName)
				.withSchedule(CronScheduleBuilder.cronSchedule(jobTime))
				.build();

		Scheduler scheduler = new StdSchedulerFactory().getScheduler();

		scheduler.start();
		scheduler.scheduleJob(job, trigger);
		return "Job Added";
	    }catch(Exception exp) {
	    	exp.printStackTrace();
	    	return "Job Not Added";
	    }
	}
	
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome in testing";
	}
}
