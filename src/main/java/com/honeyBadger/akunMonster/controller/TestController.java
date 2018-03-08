package com.honeyBadger.akunMonster.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
	
	@RequestMapping("/")
	public String index(ModelMap model) {
		
		model.addAttribute("message", "Test Berhasil");
		return "welcome";
		
	}
}
