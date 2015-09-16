package com.timposu;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="pegawai")
public class Pegawai implements Serializable{

	/**
	 * @ucuptimposu
	 */
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private Long id;
	

	@NotEmpty
	@Column(name="nama")
	private String nama;
	
	@NotNull
	@Min(1)
	@Column(name="gaji")
	private Long gaji;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Long getGaji() {
		return gaji;
	}

	public void setGaji(Long gaji) {
		this.gaji = gaji;
	}

}
