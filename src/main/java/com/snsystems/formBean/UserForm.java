package com.snsystems.formBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sai
 *
 */
public class UserForm {
	
	private String username;
	private String password;
	private List<UserForm> loginList = new ArrayList<UserForm>();
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the loginList
	 */
	public List<UserForm> getLoginList() {
		return loginList;
	}
	/**
	 * @param loginList the loginList to set
	 */
	public void setLoginList(List<UserForm> loginList) {
		this.loginList = loginList;
	}

}
