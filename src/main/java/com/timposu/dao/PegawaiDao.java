package com.timposu.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.timposu.Pegawai;
import com.timposu.Pengajuan;

@Component
public class PegawaiDao {

	@Autowired 
	private SessionFactory sessionFactory;
	
	public Pegawai save(Pegawai p){
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		return p;
	}
	
	public Pegawai delete(Pegawai p){
		sessionFactory.getCurrentSession().delete(p);
		return p;
	}
	
	public int count(){
		return (Integer) sessionFactory.getCurrentSession().
				createQuery("select count(*) from Pegawai").
				uniqueResult();
	}
	
	public Pegawai getById(Long id){
		
		if (id == null)return null;
		
		return (Pegawai) sessionFactory.getCurrentSession().
				createQuery("from Pegawai where id=:id").setParameter("id", id).
				uniqueResult();
	}
	
	public List<Pegawai> getByNama(String nama){
		return sessionFactory.getCurrentSession().
				createQuery("from Pegawai where nama like :nama").
				setParameter("nama", "%" + nama + "%").list();
	}
	
	
	public List<Pegawai> getAll(){
		return sessionFactory.getCurrentSession().
				createQuery("from Pegawai").list();
	}
	
	public Pengajuan save(Pengajuan p){
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		return p;
	}
	
	public List<Pengajuan> getAllPengajuan(Pegawai p){
		return sessionFactory.getCurrentSession().
				createQuery("from Pengajuan where id_pegawai=:id").setParameter("id", p.getId()).
				list();
	}
	
	public Long countPengajuan(){
		return (Long) sessionFactory.getCurrentSession().
				createQuery("select count(*) from Pengajuan").
				uniqueResult();
	}
}