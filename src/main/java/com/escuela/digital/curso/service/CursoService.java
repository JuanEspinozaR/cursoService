package com.escuela.digital.curso.service;

import java.util.List;

import javax.jws.WebService;

import com.escuela.digital.curso.model.Curso;
@WebService
public interface CursoService {
	/**
	 * Añade un curso a la lista de cursos
	 * @param curso
	 * @return
	 */
	Curso crearCurso(Curso curso);
	/**
	 * Modifica un curso en espefico
	 * @param curso
	 * @return
	 */
	Curso modificaCurso(Curso curso);
	/**
	 * Retorna la lista de cursos
	 * @return
	 */
	List<Curso> obtenerCursos();
	/**
	 * Eliminar un curso de la lista de cursos
	 * @param curso
	 * @return
	 */
	Curso eliminaCurso(String curso);
}
