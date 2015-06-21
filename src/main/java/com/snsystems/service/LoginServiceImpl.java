package com.snsystems.service;

import org.springframework.stereotype.Component;

@Component("loginService")
public class LoginServiceImpl implements ILoginService {

	@Override
	public String authenticate(String username, String password) {
		
		if ("test".equalsIgnoreCase(username)) {
			return "welcome";
		}
		return "login";
	}

}
