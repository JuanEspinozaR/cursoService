package com.escuela.digital.curso.service;

import java.util.List;

import javax.jws.WebService;

import com.escuela.digital.curso.model.Curso;
import com.escuela.digital.curso.repository.CursoRepository;
import com.escuela.digital.curso.repository.CursoRepositoryImpl;

@WebService(endpointInterface = "com.escuela.digital.curso.service.CursoService")
public class CursoServiceImpl implements CursoService{

	CursoRepository cursoRepository = new CursoRepositoryImpl();
	@Override
	public Curso crearCurso(Curso curso) {
		return cursoRepository.crearCurso(curso);
	}

	@Override
	public Curso modificaCurso(Curso curso) {
		return cursoRepository.modificaCurso(curso);
	}

	@Override
	public List<Curso> obtenerCursos() {
		return cursoRepository.obtenerCursos();
	}

	@Override
	public Curso eliminaCurso(String clave) {
		return cursoRepository.eliminaCurso(clave);
	}

}
