package br.com.proffy.proffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.proffy.proffy.model.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer>{

}
