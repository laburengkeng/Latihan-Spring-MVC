package com.timposu.service;

import java.util.List;

import com.timposu.Pegawai;
import com.timposu.Pengajuan;

public interface PegawaiService {
	
	public Pegawai simpan(Pegawai p);
	
	public Pegawai hapus(Pegawai p);
	
	public int count();
	
	public Pegawai getById(Long id);
	
	public List<Pegawai> getByNama(String nama);
		
	public List<Pegawai> getAll();
	
	public Pengajuan save(Pengajuan p);
	
	public List<Pengajuan> getPengajuanByKaryawan(Pegawai p);
	
	public Long countPengajuan();
 
}