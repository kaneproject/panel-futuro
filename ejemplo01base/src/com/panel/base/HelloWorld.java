package com.panel.base;

public class HelloWorld {
	
	public static void main(String[] args) {
		Integer unInteger = new Integer(7);
		int unInt = 7;
		String string = "Hola caraculo";
		Integer otroInteger = unInteger;
		int otroInt = unInt;
		Persona.setElDeEneI("elDeEneI");
		Persona jaimito = new Persona("","");
		jaimito.setNombre("Jaimito");
		Persona luisRamoncito = new Persona("","");
		luisRamoncito.setNombre("Luis Ramoncito");
		luisRamoncito.setElDeEneI("otro");
		Persona angelico = new Persona("","");
		angelico.setNombre("Angelico");
		System.out.println("valor de int antes " + unInt);
		unInt = dameInt(unInt);
		System.out.println("valor de int despues " + unInt);
		System.out.println("Nombre de luisramoncito antes " + luisRamoncito.getNombre());
		damePersona(luisRamoncito);
		System.out.println("Nombre de luisramoncito despues " + luisRamoncito.getNombre());
		System.out.println("valor de integer antes " + unInteger);
	    unInteger = dameInteger(unInteger);
		System.out.println("valor de integer despues " + unInteger);
		Persona luisRamonPoli = new Policia("1");
		//Policia poli = (Policia) luisRamonPoli;
		((Policia)luisRamonPoli).disparar();
		tomaNombre(luisRamonPoli);
	}
	public static int dameInt(int valor) {
		valor++;
		System.out.println("valor en metodo = " + valor);
		return valor;
	}
	public static void damePersona(Persona persona) {
		String nombre = persona.getNombre();
		nombre = nombre.toUpperCase();
		persona.setNombre(nombre);
		System.out.println("Nombre de luisramoncito en el metodo " + persona.getNombre());

	}
	public static Integer dameInteger(Integer valor) {
		valor++;
		System.out.println("valor de integer en metodo = " + valor);
		return valor;
	}
	// Devolver nombre y apellidos de cualquier tipo 
	// heredero de persona
	public static String tomaNombre(Persona persona) {
		return persona.getNombre() + " " + persona.getApellido1();
	}
	

}
