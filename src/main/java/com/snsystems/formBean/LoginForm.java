package com.snsystems.formBean;

import java.util.List;

/**
 * @author Sai
 *
 */
public class LoginForm {

	private UserForm userForm;
	private List<UserForm> loginList;
	
	/**
	 * @return the userForm
	 */
	public UserForm getUserForm() {
		return userForm;
	}
	/**
	 * @param userForm the userForm to set
	 */
	public void setUserForm(UserForm userForm) {
		this.userForm = userForm;
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
