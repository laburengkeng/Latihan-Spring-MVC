package com.timposu;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="pengajuan")
public class Pengajuan implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")  // format tanggal sesuai database mysql
	private Date waktu_pengajuan = new Date();

	@ManyToOne
	@JoinColumn(name="id_pemohon")
	private Pegawai pemohon;
	
	

	private Long nilai;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getWaktu_pengajuan() {
		return waktu_pengajuan;
	}

	public void setWaktu_pengajuan(Date waktu_pengajuan) {
		this.waktu_pengajuan = waktu_pengajuan;
	}

	public Pegawai getPemohon() {
		return pemohon;
	}

	public void setPemohon(Pegawai pemohon) {
		this.pemohon = pemohon;
	}

	public Long getNilai() {
		return nilai;
	}

	public void setNilai(Long nilai) {
		this.nilai = nilai;
	}
}
