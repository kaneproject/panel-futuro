package com.panel.aulas.model;

import java.util.List;

public class Aula {
	
	public Aula(String identificador, Puesto puestoProfesor, List<Puesto> puestosAlumnos) {
		super();
		this.identificador = identificador;
		this.puestoProfesor = puestoProfesor;
		this.puestosAlumnos = puestosAlumnos;
	}
	private String identificador;
	private Puesto puestoProfesor;
	private List<Puesto> puestosAlumnos;
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public Puesto getPuestoProfesor() {
		return puestoProfesor;
	}
	public void setPuestoProfesor(Puesto puestoProfesor) {
		this.puestoProfesor = puestoProfesor;
	}
	public List<Puesto> getPuestosAlumnos() {
		return puestosAlumnos;
	}
	public void setPuestosAlumnos(List<Puesto> puestosAlumnos) {
		this.puestosAlumnos = puestosAlumnos;
	}
	
}
