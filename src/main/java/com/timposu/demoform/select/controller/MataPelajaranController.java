package com.timposu.demoform.select.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.timposu.Costumer;
import com.timposu.Siswa;

@Controller
public class MataPelajaranController {


	@RequestMapping(value="/matapelajaran", method=RequestMethod.GET)
	public ModelAndView viewPage(){
		ModelAndView modelAndView = new ModelAndView("matapelajaran");
		Map<String, String> mataPelajaran = new HashMap();
		mataPelajaran.put("mtk", "MateMatika");
		mataPelajaran.put("bi", "Bahasa Indonesia");
		modelAndView.addObject("pelajaranList", mataPelajaran);
		modelAndView.addObject("pelajaranForm",new Siswa());
		return modelAndView;
		
	}
	
	@RequestMapping(value="/hasil", method=RequestMethod.POST)
	public ModelAndView view(@ModelAttribute("pelajaranForm") Siswa siswa){
		ModelAndView mm = new ModelAndView("hasil");
		mm.addObject("Siswa", siswa);
		
		return mm;
	}
	
}
