package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"second","s*"})
public class SecondController {
	
	@RequestMapping("/home")
	public String home() {
		return "Second/home";
	}
	

}
