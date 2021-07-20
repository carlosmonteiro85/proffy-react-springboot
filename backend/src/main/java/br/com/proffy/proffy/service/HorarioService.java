package br.com.proffy.proffy.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.proffy.proffy.model.Horarios;
import br.com.proffy.proffy.repository.HorariosRepository;

@Service
public class HorarioService {

	private HorariosRepository horarioRepository;

	public HorarioService(HorariosRepository horarioRepository) {
		this.horarioRepository = horarioRepository;
	}

	public void save(Horarios horario) {
		horarioRepository.save(horario);
	}

	public Horarios loadById(Integer id) {
		return horarioRepository.findById(id).orElse(null);
	}

	public List<Horarios> findAll() {
		return horarioRepository.findAll();
	}

	public void delete(Horarios horario) {
		horarioRepository.delete(horario);
	}

}
