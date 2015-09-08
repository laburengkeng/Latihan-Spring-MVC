package com.timposu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.timposu.Pegawai;
import com.timposu.Pengajuan;
import com.timposu.dao.PegawaiDao;
import com.timposu.service.PegawaiService;


@Service("pegawaiService")
@Transactional(readOnly=true)
public class PegawaiServiceImpl implements PegawaiService{
	
	@Autowired
	private PegawaiDao pegawaiDao;

	@Transactional(readOnly=false)
	public Pegawai simpan(Pegawai p) {
		return pegawaiDao.save(p);		
	}

	@Transactional(readOnly=false)
	public Pegawai hapus(Pegawai p) {
		return pegawaiDao.delete(p);
	}

	public int count() {
		return pegawaiDao.count();
	}

	public Pegawai getById(Long id) {
		return pegawaiDao.getById(id);
	}
	
	public List<Pegawai> getByNama(String nama) {
		return pegawaiDao.getByNama(nama);
	}

	public List<Pegawai> getAll() {
		return pegawaiDao.getAll();
	}
	
	@Transactional(readOnly=false)
	public Pengajuan save(Pengajuan p) {
		// TODO Auto-generated method stub
		
		return pegawaiDao.save(p);
	}

	public List<Pengajuan> getPengajuanByKaryawan(Pegawai p) {
				
		return pegawaiDao.getAllPengajuan(p);
	}

	public Long countPengajuan() {
		
		return pegawaiDao.countPengajuan();
	}

	

}