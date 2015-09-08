package com.timposu.demoform.select.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.timposu.demoform.select.Smartphone;

@Controller
public class SmartphoneController {
	
	@RequestMapping(value="/phone-page")
	private ModelAndView selectTag(){
		ModelAndView mm = new ModelAndView("phone-page");
		
		Map<String, String> phones = new HashMap();
		
		phones.put("samsung", "SAMSUNG");
		phones.put("nokia", "NOKIA");
		phones.put("iphone", "IPHONE");
		
		mm.addObject("phonesMap", phones);
		mm.addObject(new Smartphone());
		
		return mm;
	}
	
	@RequestMapping(value="/phone-result", method=RequestMethod.POST)
	private ModelAndView process(@ModelAttribute Smartphone smartphone){
		ModelAndView mm = new ModelAndView("phone-result");
		
		if (smartphone == null) return null;
		
		mm.addObject("smartphone", smartphone);
		
		return mm;
	}
}
