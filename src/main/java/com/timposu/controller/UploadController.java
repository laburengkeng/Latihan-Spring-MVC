package com.timposu.controller;

import java.io.File;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);
	
	private String folderTujuan = "/uploads";
	
	@RequestMapping(value="/upload/form", method=RequestMethod.GET)
	public void tampilkanFormUpload(){}
	
	@RequestMapping(value="/upload/form", method=RequestMethod.POST)
	public String prosesFormUpload(HttpSession session, 
			@RequestParam("fileUpload") MultipartFile hasilUpload){
		
		String lokasiUpload = tujuanUpload(session).getAbsolutePath();
		
		LOGGER.debug("Nama File [{}]" , hasilUpload.getOriginalFilename() );
		LOGGER.debug("Ukuran File [{}]" , hasilUpload.getSize() );
		LOGGER.debug("Type File [{}]" , hasilUpload.getContentType() );
		
		File tujuan = new File(lokasiUpload + File.separator + hasilUpload.getOriginalFilename());
		
		try {
			hasilUpload.transferTo(tujuan);
			LOGGER.debug("File berhasil disimpan di [{}]", tujuan.getAbsolutePath());
		} catch (Exception e) {
			LOGGER.error("GAGAL MENYIMPAN FILE");
			LOGGER.error("Penyebab : {}", e.getMessage());
		}
		
		return "upload/list";
	}
	
	@RequestMapping(value="/upload/list")
	public ModelMap tampilkanHasilUpload(){
		ModelMap mm = new ModelMap();
		
		return mm;
	}
	
	public File tujuanUpload(HttpSession session){
		String lokasiFullPath = session.getServletContext().getRealPath(folderTujuan);
		LOGGER.debug("Lokasi full path : [{}]" , lokasiFullPath);
		
		File file = new File(lokasiFullPath);
		if(!file.exists()){
			LOGGER.debug("lokasi tujuan belum ada kita buat dulu");
			file.mkdirs();
		}
		
		return file;
	}
}
