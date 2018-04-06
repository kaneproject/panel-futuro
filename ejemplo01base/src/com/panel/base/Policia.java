package com.panel.base;

public class Policia extends Persona implements Ejcamochador{

	private String idPlaca;
	
	public Policia(String idPlaca) {
		super("Jane","Doe");
		this.idPlaca = idPlaca;
		System.out.println("Poli creado");
	}

	public void disparar() {
		System.out.println("Bang!!");
	}

	@Override
	public void escamochar() {
		for(int i = 0; i < 10;i++) {
			System.out.println("Saco el pincho y zaaaka zaka!");
		}	
	}
}
