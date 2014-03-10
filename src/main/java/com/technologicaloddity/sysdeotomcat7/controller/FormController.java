package com.technologicaloddity.sysdeotomcat7.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import com.technologicaloddity.sysdeotomcat7.model.FormModel;
import com.technologicaloddity.sysdeotomcat7.model.FormValidator;

@Controller
public class FormController {

	@Autowired
	private FormValidator formValidator;
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String showForm(Model model) {
		model.addAttribute("formModel", new FormModel());
		return "form-get";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String postForm(Model model, @ModelAttribute("formModel") FormModel formModel, BindingResult bindingResult ) {
		formValidator.validate(formModel, bindingResult);
		if(bindingResult.hasErrors()) {
			return "form-get";
		} else {
			return "form-post";
		}
	}
	
	
}
