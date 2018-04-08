package com.panel.biblioteca.core.model.entities;

public class Libro {
	private String titulo;
	private String autor;
	private String sinopsis;
	private String isbn;
	private Integer numeroPaginas;
	
	
	
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", sinopsis=" + sinopsis + ", isbn=" + isbn
				+ ", numeroPaginas=" + numeroPaginas + "]";
	}
	public Libro() {
		super();
		
	}
	public Libro(String titulo, String isbn) {
		super();
		this.titulo = titulo;
		this.isbn = isbn;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Integer getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(Integer numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
}
