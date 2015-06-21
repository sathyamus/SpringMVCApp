package com.snsystems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.snsystems.formBean.UserForm;

/**
 * @author Sai
 *
 */
@Controller
@RequestMapping("/")
public class HomepageController {

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(@ModelAttribute UserForm userForm, ModelMap model) {
		model.addAttribute("message", "Hello Spring MVC Framework!");
		return "login";
	}
	
}
