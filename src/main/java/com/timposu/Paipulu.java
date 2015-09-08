package com.timposu;

import java.io.Serializable;



public class Paipulu implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -571169431587375953L;
	private Pegawai pemohon;
	
	

	public Pegawai getPemohon() {
		return pemohon;
	}

	public void setPemohon(Pegawai pemohon) {
		this.pemohon = pemohon;
	}

}