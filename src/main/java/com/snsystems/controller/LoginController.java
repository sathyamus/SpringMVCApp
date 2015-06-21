package com.snsystems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snsystems.formBean.UserForm;
import com.snsystems.service.ILoginService;

/**
 * LoginController
 * 
 * @author Sai
 *
 */
@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private ILoginService loginService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute UserForm userForm, ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "login";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public String authenticate(@ModelAttribute UserForm userForm, ModelMap model) {
		String login = loginService.authenticate(userForm.getUsername(), userForm.getPassword());
		if ("welcome".equalsIgnoreCase(login)) {
			model.addAttribute("message", "Login Success!");
		} else {
			model.addAttribute("message", "Login Failure!");
		}
		return login;
	}

}
