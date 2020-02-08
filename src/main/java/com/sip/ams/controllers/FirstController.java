package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = {"first","f*"})
public class FirstController {
	
	@Value("${myMessage}")
	private String msg;
	
	
	@RequestMapping("/home")
	public String home(@RequestParam(required=false, defaultValue = "Spring Boot") 
								String framework,@RequestParam String param2 , Model model) {
		System.out.println(framework);
		model.addAttribute("frm", framework).addAttribute("param2", param2).addAttribute("message", msg);

		
		ArrayList<String> lstFormation = new ArrayList<String>();
		lstFormation.add("Ali");
		lstFormation.add("Ossema");
		lstFormation.add("Ahmed");
		
		model.addAttribute("lstFormation",lstFormation);
		
		Formation formation1 = new Formation(1, "OCA", "30h", "JAVA");
		Formation formation2 = new Formation(2, "Angular", "40h", "TypeScript");
		
		ArrayList<Formation> formations = new ArrayList<Formation>();
		formations.add(formation1);
		formations.add(formation2);
		
		model.addAttribute("formations",formations);
		
		return "First/home";
	}
	
	
	
	
	@RequestMapping("/book")
	public String book() {
		return "book";
	}
	
	@RequestMapping("/liste")
	public String listFormation(Model model) {
		
		
		return "First/home";
	}
	

}
