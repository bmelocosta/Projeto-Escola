package escola2020.dominio;

import javax.validation.constraints.NotNull;

public class Titulacao {
	@NotNull
	private Integer codigo;
	@NotNull
	private String nome;
	@NotNull
	private double pisoHoraAula;

	 
	public Titulacao() {

	}

	public Titulacao(Integer codigo, String nome, double pisoHoraAula) {

		this.codigo = codigo;
		this.nome = nome;
		this.pisoHoraAula = pisoHoraAula;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPisoHoraAula() {
		return pisoHoraAula;
	}

	public void setPisoHoraAula(double pisoHoraAula) {
		this.pisoHoraAula = pisoHoraAula;
	}

}
