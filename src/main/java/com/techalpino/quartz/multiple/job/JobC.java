/**
 * 
 */
package com.techalpino.quartz.multiple.job;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Rinku Vats
 *
 */

public class JobC implements Job {

	@Override
	public void execute(JobExecutionContext context)
		throws JobExecutionException {
		System.out.println("Job C is runing");
	}

}