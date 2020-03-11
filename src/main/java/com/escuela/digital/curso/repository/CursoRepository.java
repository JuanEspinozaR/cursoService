package com.escuela.digital.curso.repository;

import java.util.List;

import com.escuela.digital.curso.model.Curso;

public interface CursoRepository {
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
	 * @param string
	 * @return
	 */
	Curso eliminaCurso(String clave);
}
