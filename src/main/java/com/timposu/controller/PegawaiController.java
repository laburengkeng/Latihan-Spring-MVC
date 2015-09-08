package com.timposu.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import com.timposu.Pegawai;
import com.timposu.service.PegawaiService;


@Controller
public class PegawaiController {
        
    @Autowired PegawaiService pegawaiService;
    
    
    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelMap list(@RequestParam(required=false) String nama){
    	List<Pegawai> list = new ArrayList<Pegawai>();
    	
    	if(StringUtils.hasText(nama)){
    		list.addAll(pegawaiService.getByNama(nama));
    	}else{
    		list.addAll(pegawaiService.getAll());
    	}
    	
    	ModelMap mm = new ModelMap();
    	
    	mm.addAttribute("pegawaiList", list);
    	
    	return mm;
    }
	
	@RequestMapping(value="/form", method=RequestMethod.GET)
	public String viewPegawai(@RequestParam(required = false) Long id,
			Map<String, Object> model){
		
		Pegawai pegawai = pegawaiService.getById(id);

		if (pegawai == null){
			pegawai = new Pegawai();
		}
		
		
		model.put("pegawaiForm", pegawai);
		return "form";
	}
	
	@RequestMapping(value="/form" , method=RequestMethod.POST)
	public String sukses(@Validated @ModelAttribute Pegawai pegawai,
			BindingResult result,  SessionStatus status){
		
		if(result.hasErrors()){
			return "form";
		}
		
        pegawaiService.simpan(pegawai);
        
        status.setComplete();
		return "redirect:list";
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String hapus(@RequestParam(required=false) Long id){
		
		Pegawai pegawai = pegawaiService.getById(id);
		
		if(pegawai == null) return null;
		
		pegawaiService.hapus(pegawai);
		
		return "redirect:list";
		
	}
}