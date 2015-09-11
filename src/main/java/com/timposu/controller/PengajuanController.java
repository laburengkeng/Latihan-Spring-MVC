package com.timposu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.timposu.Pengajuan;
import com.timposu.service.PegawaiService;

@Controller
public class PengajuanController extends MultiActionController {
	
	@Autowired
	private PegawaiService pegawaiService;
	
	@RequestMapping(value="/pengajuan" , method=RequestMethod.GET)
	public ModelMap displayForm(){
		
		Pengajuan pengajuan = new Pengajuan();
		
		ModelMap model = new ModelMap();
		model.addAttribute("pengajuanForm", pengajuan);
		model.addAttribute("pegawaiList",pegawaiService.getAll());
		
		return model;
		
	}
	
	@RequestMapping(value="/pengajuan", method=RequestMethod.POST)
	public String processForm(@ModelAttribute("pengajuanForm")  Pengajuan p, 
			BindingResult errors,  SessionStatus status){

		if(errors.hasErrors()){
			return "pengajuan";
		}
		
		pegawaiService.save(p);
		status.setComplete();
		return "redirect:pengajuan";
	}
}
