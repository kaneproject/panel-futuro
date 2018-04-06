package com.panel.biblioteca.core;

import java.util.ArrayList;
import java.util.List;

import com.panel.biblioteca.core.model.business.BibliotecaNegocio;
import com.panel.biblioteca.core.model.dao.LibrosMapDao;
import com.panel.biblioteca.core.model.entities.Libro;

public class LanzadorBiblioteca {
	public static void main(String[] args) {
		BibliotecaNegocio negocio = new BibliotecaNegocio(new LibrosMapDao());
		List<Libro> libros = new ArrayList<>();
		libros.add(new Libro("ESDLA", "1"));
		libros.add(new Libro("El jobit", "2"));
		libros.add(new Libro("Soy Funcional", "3"));
		libros.add(new Libro("Que triste es vivir", "4"));
		negocio.agregarLibros(libros);
		List<String> isbns = new ArrayList<>();
		isbns.add("1");
		isbns.add("2");
		isbns.add("3");
		isbns.add("4");
		
		System.out.println("Tiene que haber 4 :  salida " + 
				negocio.obtenerLibros(isbns).size());
		Libro libro = negocio.obtenerLibros(isbns).iterator().next();
		libro.setAutor("A ver donde estoy");
		negocio.sustituirLibro(libro);
		negocio.eliminarLibros(isbns);
		System.out.println("Tiene que haber 0 :  salida " + 
				negocio.obtenerLibros(isbns).size());
		
	}
}
