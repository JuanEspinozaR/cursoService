package com.escuela.digital.curso.model;

public class Curso {
	private String clave;
	private String nombre;
	private String descripcion;
	private Categoria categoria;
	
	public Curso() {}
	
	public Curso(Curso curso) {
		this.clave = curso.clave;
		this.nombre = curso.nombre;
		this.descripcion = curso.descripcion;
		this.categoria = curso.categoria;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
