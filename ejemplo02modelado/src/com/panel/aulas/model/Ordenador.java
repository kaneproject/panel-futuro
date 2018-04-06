package com.panel.aulas.model;

public class Ordenador {
	// EN MB
	private Integer memoria;
	private Integer hdd;
	private Boolean virtualizacion;
	private Arquitectura arquitectura;
	private Plataforma plataforma;
	public Integer getMemoria() {
		return memoria;
	}
	public void setMemoria(Integer memoria) {
		this.memoria = memoria;
	}
	public Integer getHdd() {
		return hdd;
	}
	public void setHdd(Integer hdd) {
		this.hdd = hdd;
	}
	public Boolean getVirtualizacion() {
		return virtualizacion;
	}
	public void setVirtualizacion(Boolean virtualizacion) {
		this.virtualizacion = virtualizacion;
	}
	public Arquitectura getArquitectura() {
		return arquitectura;
	}
	public void setArquitectura(Arquitectura arquitectura) {
		this.arquitectura = arquitectura;
	}
	public Plataforma getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}
}
