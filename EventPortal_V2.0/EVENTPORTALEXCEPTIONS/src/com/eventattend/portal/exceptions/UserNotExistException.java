/*
 * Copyright 2015-2016 Seedcube LLC. All Rights Reserved.
 * This software is the confidential and proprietary information of
 * Seedcube("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into 
 * with Seedcube.
 * 
 * CHANGE HISTORY
 * ==================================================================================
 * Oct 19, 2010 - mmanimaran created the file.
 * 
 */
package com.eventattend.portal.exceptions;

/**
 * Class Description
 *    
 * @version 1.0
 * @author mmanimaran
 * @Date Oct 19, 2010
 * 
 * Copyright 2015-2016 Seedcube LLC. All Rights Reserved.
 * This software is the proprietary information of Seedcube LLC.
 * Use is subject to license terms.
 */
public class UserNotExistException extends DatabaseException {

	static final long serialVersionUID = -5829545098534135052L;

	/**
	 * 
	 */
	public UserNotExistException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public UserNotExistException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param msg
	 */
	public UserNotExistException(String msg) {
		super(msg);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public UserNotExistException(Throwable arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	

}
