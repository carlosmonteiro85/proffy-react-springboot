package br.com.proffy.proffy.model.enums;

public enum DiaSemanaEnum {
	
	SEGUNDA("Segunda"), TERCA("Terça"), QUARTA("Quarta"), QUINTA("Quinta"), SEXTA("Sexta"), SABADO("Sábado"), DOMINGO("Domingo");

	private String codigo;

	private DiaSemanaEnum(String codigo) {
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public static DiaSemanaEnum obterPorCodigo(String codigo) {
		for (DiaSemanaEnum genero : values()) {
			if (genero.getCodigo().equals(codigo)) {
				return genero;
			}
		}
		return null;
	}

}
