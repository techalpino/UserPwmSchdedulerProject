/**
 * 
 */
package com.techalpino.db.operations;


/**
 * @author Rinku Vats
 *
 */
public class Task {

 int taskId ;
 String taskName ;
 String executionTime ;
/**
 * @return the taskId
 */
public int getTaskId() {
	return taskId;
}
/**
 * @param taskId the taskId to set
 */
public void setTaskId(int taskId) {
	this.taskId = taskId;
}
/**
 * @return the taskName
 */
public String getTaskName() {
	return taskName;
}
/**
 * @param taskName the taskName to set
 */
public void setTaskName(String taskName) {
	this.taskName = taskName;
}
/**
 * @return the executionTime
 */
public String getExecutionTime() {
	return executionTime;
}
/**
 * @param executionTime the executionTime to set
 */
public void setExecutionTime(String executionTime) {
	this.executionTime = executionTime;
}
 
}
