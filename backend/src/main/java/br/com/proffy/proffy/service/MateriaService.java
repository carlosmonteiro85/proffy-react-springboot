package br.com.proffy.proffy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.proffy.proffy.model.Materia;
import br.com.proffy.proffy.repository.MateriaRepository;

@Service
public class MateriaService {

	private MateriaRepository materiaRepository;

	public MateriaService(MateriaRepository materiaRepository) {
		this.materiaRepository = materiaRepository;
	}

	public void save(Materia materia) {
		materiaRepository.save(materia);
	}

	public Materia loadById(Integer id) {
		return materiaRepository.findById(id).orElse(null);
	}

	public List<Materia> findAll() {
		return materiaRepository.findAll();
	}

	public void delete(Materia materia) {
		materiaRepository.delete(materia);
	}

}
