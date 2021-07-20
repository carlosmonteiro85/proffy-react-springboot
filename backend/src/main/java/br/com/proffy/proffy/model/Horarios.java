package br.com.proffy.proffy.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import br.com.proffy.proffy.model.enums.DiaSemanaEnum;

@Entity
@Table(name = "horarios")
public class Horarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private DiaSemanaEnum diaSemana;
	private LocalDateTime inicio;
	private LocalDateTime temino;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public DiaSemanaEnum getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(DiaSemanaEnum diaSemana) {
		this.diaSemana = diaSemana;
	}
	public LocalDateTime getInicio() {
		return inicio;
	}
	public void setInicio(LocalDateTime inicio) {
		this.inicio = inicio;
	}
	public LocalDateTime getTemino() {
		return temino;
	}
	public void setTemino(LocalDateTime temino) {
		this.temino = temino;
	}
}
