package com.panel.biblioteca.core;

import com.panel.biblioteca.core.model.dao.LibrosMapDao;
import com.panel.biblioteca.core.model.dao.LibrosPostgresDao;
import com.panel.biblioteca.core.model.dao.interfaces.IBibliotecaDao;

public class FabricaBibliotecaDao {

	public static IBibliotecaDao getBibliotecaDao() {
		try {
			return new LibrosPostgresDao();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			return new LibrosMapDao();
		}
	}
}
