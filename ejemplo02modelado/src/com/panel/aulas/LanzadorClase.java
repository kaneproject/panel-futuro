package com.panel.aulas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

import com.panel.aulas.model.Alumno;
import com.panel.aulas.model.Aula;
import com.panel.aulas.model.Persona;
import com.panel.aulas.model.Profesor;
import com.panel.aulas.model.Puesto;

public class LanzadorClase {
	private static AtomicInteger contador;
	static {
		contador = new AtomicInteger(0);
	}
	
	public static void main(String[] args) {
		List<Puesto> listaPuestoAlumnos = new LinkedList<>();
		Aula aula = new Aula("SD08",new Puesto(contador.incrementAndGet(),new Profesor(),null),listaPuestoAlumnos);
		while(contador.get()<20) {
			listaPuestoAlumnos.add(
					new Puesto(
							contador.incrementAndGet(),
							new Alumno(),
							null));
			
		}
		listaPuestoAlumnos.forEach((puesto)->{
			System.out.println("Posicion " + puesto.getNumeroPuesto());
			});

		Iterator<Puesto> iterator = listaPuestoAlumnos.iterator();
		while (iterator.hasNext()) {
			Puesto puestoActual = iterator.next();
			System.out.println("Posicion " + puestoActual.getNumeroPuesto());
		}
		for(int i = 0; i< listaPuestoAlumnos.size();i++) {
			Puesto puestoActual =  listaPuestoAlumnos.get(i);
			System.out.println("Posicion " + puestoActual.getNumeroPuesto());
			
		}
		// HashSets
	
		Set<String> colores = new HashSet<>();
		
		colores.add("ROJO");
		colores.add("ROJO");
		colores.add("ROJO");
		colores.add("ROJO");
		colores.add("ROJO");
		colores.add("VERDE");
		colores.add("VERDE");
		colores.add("AZUL");
		colores.add("azul");
		colores.add("Azul");
		System.out.println(colores.size());
		Set<Persona> personas = new HashSet<>();
		personas.add(new Persona("A"));
		personas.add(new Persona("B"));
		Persona persona3 = new Persona("A");
		personas.add(persona3);
		personas.add(persona3);
		Persona persona4 = persona3;
		personas.add(persona4);
		System.out.println(personas.size());
		Map<String,Persona> castigados = new HashMap<>();
		castigados.put("A", new Persona("A"));
		castigados.put("R", new Persona("R"));
		
		
		Persona persona = castigados.get("R");
		System.out.println(persona.getDni());
		try {
			castigados.get("S").getDni();
		}catch (NullPointerException e) {
			System.out.println("La cagaste");
		}
		Set<String> keySet = castigados.keySet();
		keySet.forEach((clave)->{System.out.println(clave);});
		Collection<Persona> personillasCastigadas = castigados.values();
		castigados.forEach((clave,valor)->{
			System.out.println("Dada la clave " + clave + " valor " + valor.getDni());
		});
		
		
		
		
		
	}

}
