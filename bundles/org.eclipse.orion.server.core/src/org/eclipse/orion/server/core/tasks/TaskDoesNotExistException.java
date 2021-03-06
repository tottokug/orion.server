/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.orion.server.core.tasks;

public class TaskDoesNotExistException extends TaskOperationException {
	
	private static final long serialVersionUID = -1589919934005882693L;
	
	private String taskId;

	public TaskDoesNotExistException(String taskId) {
		super("Task does not exist: " + taskId);
		this.taskId = taskId;
	}

	public String getTaskId() {
		return taskId;
	}
}
