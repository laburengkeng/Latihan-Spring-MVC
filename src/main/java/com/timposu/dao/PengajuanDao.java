package com.timposu.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.timposu.Pengajuan;

public class PengajuanDao {

	@Autowired private SessionFactory sessionFactory;
	
	public Pengajuan save(Pengajuan p){
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		return p;
	}
	
	public Pengajuan delete(Pengajuan p){
		sessionFactory.getCurrentSession().delete(p);
		return p;
	}
	
	public int count(){
		return (Integer) sessionFactory.getCurrentSession().
				createQuery("select count(*) from Pengajuan").
				uniqueResult();
	}
	
	public Pengajuan getById(Long id){
		
		if (id == null)return null;
		
		return (Pengajuan) sessionFactory.getCurrentSession().
				createQuery("from Pengajuan where id=:id").setParameter("id", id).
				uniqueResult();
	}
	
	
	
	public List<Pengajuan> getAll(){
		return sessionFactory.getCurrentSession().
				createQuery("from Pengajuan").list();
	}
	
}
