/**
 * 
 */
package com.techalpino.db.operations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;


/**
 * @author Rinku Vats
 *
 */

@Component
public class TaskOperationImpl implements TaskOperation {

	/* (non-Javadoc)
	 * @see com.techalpino.operations.service.TaskOperation#getTasks()
	 */
	@Override
	public List<Task> getTasks() {
		// DB Operations Currently Demo Response 
		
		List<Task> taskList = new ArrayList<Task>() ;
		Task task = new Task() ;
		task.setExecutionTime("12 06");
		task.setTaskId(1);
		taskList.add(task) ;
		
		return taskList ;
	}

}
