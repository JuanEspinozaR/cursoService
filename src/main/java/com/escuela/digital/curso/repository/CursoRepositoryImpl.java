package com.escuela.digital.curso.repository;

import java.util.ArrayList;
import java.util.List;

import com.escuela.digital.curso.model.Curso;

public class CursoRepositoryImpl implements CursoRepository {

	private static List<Curso> cursos = new ArrayList<Curso>();
	@Override
	public Curso crearCurso(Curso curso) {
		cursos.add(curso);
		return curso;
	}

	@Override
	public Curso modificaCurso(Curso curso) {
		for(int i =0 ; i <cursos.size();i++)
			if(cursos.get(i).getClave().equalsIgnoreCase(curso.getClave())) {
				cursos.get(i).setDescripcion(curso.getDescripcion());
				cursos.get(i).setNombre(curso.getNombre());
				cursos.get(i).setCategoria(curso.getCategoria());
				return curso;
			}
		return null;
	}

	@Override
	public List<Curso> obtenerCursos() {
		return cursos;
	}

	@Override
	public Curso eliminaCurso(String clave) {
		for(int i =0 ; i <cursos.size();i++)
			if(cursos.get(i).getClave().equalsIgnoreCase(clave)) {
				Curso curso = cursos.get(i);
				cursos.remove(i);
				return curso;
			}		
		return null;
	}

}
