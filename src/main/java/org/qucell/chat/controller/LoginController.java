package org.qucell.chat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	//use temporary -> redirecting
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login() {
		return "login";
	}
}
