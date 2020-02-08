package com.sip.ams.controllers;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("boot")
public class BootstrapController {
	
	@RequestMapping("/bc")
	public String Accueil(Model model) {
		model.addAttribute("datetime", new Date());
		model.addAttribute("name", "Fahd Rahali");
		return "Bootstrap/accueil";
	}
	
	@RequestMapping("/example")
	public String Example(Model model) {
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
		
		model.addAttribute("Nom", "Rahali");
		model.addAttribute("Prenom", "Fahd");
		model.addAttribute("Email", "rahali.fahd@gmail.com");
		model.addAttribute("Profession", "Developer");
		return "Bootstrap/example";
	}

}
