package com.panel.biblioteca.core.model.dao.interfaces;

import java.util.Collection;

import com.panel.biblioteca.core.model.entities.Libro;

public interface IBibliotecaDao {

	/**
	 * Metodo que guarda un libro
	 * @param libro - Libro a guardar
	 */
	void crear(Libro libro);
	
	void actualizar(Libro libro);
	
	void borrar(String isbn);
	
	Collection<Libro> listar();
	
	Libro buscar(String isbn);
	
}
