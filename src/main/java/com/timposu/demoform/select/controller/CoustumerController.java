package com.timposu.demoform.select.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.timposu.Costumer;

@Controller
public class CoustumerController {
	
		@RequestMapping(value="/country", method=RequestMethod.GET)
		public ModelAndView viewPage(){
			ModelAndView modelAndView = new ModelAndView("country");
			Map<String, String> con = new HashMap();
			con.put("ina", "Indonesia");
			con.put("may", "Malaysia");
			con.put("tha", "Thailand");
			modelAndView.addObject("countryList", con);
			modelAndView.addObject("costumerForm",new Costumer());
			return modelAndView;
			
		}
		
		@RequestMapping(value="", method=RequestMethod.POST)
		public ModelAndView ooSubmit(@ModelAttribute Costumer costumer){
			ModelAndView model = new ModelAndView("hasil");
			model.addObject("costumerr", costumer);
			return model;
		}
}
