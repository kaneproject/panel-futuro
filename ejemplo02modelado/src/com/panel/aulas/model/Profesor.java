package com.panel.aulas.model;

import java.util.List;

public class Profesor extends Persona {
	private String empresa;
	private List<Curso> curso;
	private Titulo titulos;
	
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public List<Curso> getCurso() {
		return curso;
	}
	public void setCurso(List<Curso> curso) {
		this.curso = curso;
	}
	public Titulo getTitulos() {
		return titulos;
	}
	public void setTitulos(Titulo titulos) {
		this.titulos = titulos;
	}

}
