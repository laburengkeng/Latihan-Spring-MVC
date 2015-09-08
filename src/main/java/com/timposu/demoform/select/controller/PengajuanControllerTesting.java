package com.timposu.demoform.select.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.timposu.Pengajuan;
import com.timposu.service.PegawaiService;

@Controller
public class PengajuanControllerTesting {

	@Autowired private PegawaiService service;
	
	@RequestMapping(value="/pengajuan-page", method=RequestMethod.GET)
	public ModelAndView viewList(){
		ModelAndView mm = new ModelAndView("pengajuan-page");
		Pengajuan pengajuan = new Pengajuan();
		mm.addObject("pemohonList", service.getAll());
		mm.addObject("pengajuanForm1",pengajuan);
		return mm;
	}
	
	
	@RequestMapping(value="/result", method=RequestMethod.POST)
	public ModelAndView hasil(@ModelAttribute ("pengajuanForm1") Pengajuan pengajuan, 
		BindingResult result,  SessionStatus status){
		
		ModelAndView mm = new ModelAndView("result");
		
		mm.addObject("pengajuan", pengajuan);
		return mm;
	}
	

	
}
