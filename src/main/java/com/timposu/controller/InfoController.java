package com.timposu.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InfoController {
	
	@RequestMapping("/info/users")
	@ResponseBody
	public Map<String, Object> infoUser(){
		Map<String, Object> info = new HashMap<String, Object>();
		info.put("currentUser", SecurityContextHolder.getContext().getAuthentication().getName());
		return info;
		
	}
}
