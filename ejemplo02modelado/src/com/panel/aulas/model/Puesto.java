package com.panel.aulas.model;

public class Puesto {
	private Integer numeroPuesto;
	private Persona persona;
	private Ordenador ordenador;
	
	public Puesto(Integer numeroPuesto, Persona persona, Ordenador ordenador) {
		super();
		this.numeroPuesto = numeroPuesto;
		this.persona = persona;
		this.ordenador = ordenador;
	}
	public Integer getNumeroPuesto() {
		return numeroPuesto;
	}
	public void setNumeroPuesto(Integer numeroPuesto) {
		this.numeroPuesto = numeroPuesto;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public Ordenador getOrdenador() {
		return ordenador;
	}
	public void setOrdenador(Ordenador ordenador) {
		this.ordenador = ordenador;
	}
}
