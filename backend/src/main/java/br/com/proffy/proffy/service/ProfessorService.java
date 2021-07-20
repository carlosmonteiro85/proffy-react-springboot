package br.com.proffy.proffy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.proffy.proffy.model.Professor;
import br.com.proffy.proffy.repository.ProfessorRepository;

@Service
public class ProfessorService {

	private ProfessorRepository professorRepository;

	public ProfessorService(ProfessorRepository professorRepository) {
		this.professorRepository = professorRepository;
	}

	public void save(Professor professor) {
		professorRepository.save(professor);
	}

	public Professor loadById(Integer id) {
		return professorRepository.findById(id).orElse(null);
	}

	public List<Professor> findAll() {
		return professorRepository.findAll();
	}

	public void delete(Professor professor) {
		professorRepository.delete(professor);
	}

}
