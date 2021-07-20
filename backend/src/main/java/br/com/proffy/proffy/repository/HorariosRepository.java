package br.com.proffy.proffy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.proffy.proffy.model.Horarios;

@Repository
public interface HorariosRepository extends JpaRepository<Horarios, Integer> {

}
