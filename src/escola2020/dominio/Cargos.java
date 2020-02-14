package escola2020.dominio;

import javax.validation.constraints.NotNull;

public class Cargos {
	@NotNull
	private int codigo;
	@NotNull
	private String nome;
	private String descricao;
	private String competencias;
	private Double pisoSalarial;
	
	public Cargos() {
		
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCompetencias() {
		return competencias;
	}
	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}
	public Double getPisoSalarial() {
		return pisoSalarial;
	}
	public void setPisoSalarial(Double pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}
	
}
