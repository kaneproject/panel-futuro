package com.panel.biblioteca.core.model.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.panel.biblioteca.core.model.dao.interfaces.IBibliotecaDao;
import com.panel.biblioteca.core.model.entities.Libro;

public class LibrosMapDao implements IBibliotecaDao {
	private static Map<String, Libro> libros;

	static {
		libros = new HashMap<>();
	}
	@Override
	public void crear(Libro libro) {
		libros.put(libro.getIsbn(), libro);
		
	}

	@Override
	public void actualizar(Libro libro) {
		libros.replace( libro.getIsbn(),libro);
		
	}

	@Override
	public void borrar(String isbn) {
		libros.remove(isbn);
		
	}

	@Override
	public Collection<Libro> listar() {
		
		return libros.values();
	}

	@Override
	public Libro buscar(String isbn) {
		
		return libros.get(isbn);
	}
	
}
