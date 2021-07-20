package br.com.proffy.proffy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.proffy.proffy.model.Aluno;
import br.com.proffy.proffy.repository.AlunoRepository;

@Service
public class AlunoService {

	private AlunoRepository alunoRepository;

	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}

	public void save(Aluno aluno) {
		alunoRepository.save(aluno);
	}

	public Aluno loadById(Integer id) {
		return alunoRepository.findById(id).orElse(null);
	}

	public List<Aluno> findAll() {
		return alunoRepository.findAll();
	}

	public void delete(Aluno aluno) {
		alunoRepository.delete(aluno);
	}

}
