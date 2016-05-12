/**
 * 
 */
package com.techalpino.db.operations;

import org.springframework.stereotype.Component;

/**
 * @author Rinku Vats
 *
 */
@Component
public class EmailSMSTask {

	public boolean send(EmailSMSContent emailContent) {
		boolean result = false;

		// Sending Email LOgic
		if (null != emailContent) {

			// 1 For Email Sending
			if (1 == emailContent.getTaskId()) {
				System.out.println("Email sent to "
						+ emailContent.getDestination() + " Successfully");
				result = true;
			}
			// for SMS sending
			else if (2 == emailContent.getTaskId()) {
				System.out.println("SMS sent to "
						+ emailContent.getDestination() + " Successfully");
				result = true;
			}

		}
		return result;
	}
}
