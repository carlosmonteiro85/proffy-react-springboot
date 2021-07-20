package br.com.proffy.proffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.proffy.proffy.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
