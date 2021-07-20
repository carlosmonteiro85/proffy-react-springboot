package br.com.proffy.proffy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.proffy.proffy.model.Curso;
import br.com.proffy.proffy.repository.CursoRepository;

@Service
public class CursoService {

	private CursoRepository cursoRepository;

	public CursoService(CursoRepository cursoRepository) {
		this.cursoRepository = cursoRepository;
	}

	public void save(Curso curso) {
		cursoRepository.save(curso);
	}

	public Curso loadById(Integer id) {
		return cursoRepository.findById(id).orElse(null);
	}

	public List<Curso> findAll() {
		return cursoRepository.findAll();
	}

	public void delete(Curso curso) {
		cursoRepository.delete(curso);
	}

}
