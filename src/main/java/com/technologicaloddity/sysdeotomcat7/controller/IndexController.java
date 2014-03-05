package com.technologicaloddity.sysdeotomcat7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.technologicaloddity.sysdeotomcat7.service.TestMessageService;

@Controller
public class IndexController {
	
	@Autowired
	private TestMessageService testMessageService;
	
	@RequestMapping("/")
	public String handleRequest(Model model) {
		model.addAttribute("testMessage", testMessageService.getTestMessage());
		return "index";
	}

}
