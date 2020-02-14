package escola2020.dominio;

import java.util.ArrayList;

import javax.validation.constraints.NotNull;

public class NecessidadesEspeciais {
	@NotNull
	private Integer codigo;
	@NotNull
	private String nome;
	@NotNull
	private String descricao;
	@NotNull
	private String requisitos;
	private ArrayList<Alunos> alunos;
	

	public NecessidadesEspeciais() {
		this.alunos = new ArrayList<Alunos>();
	}

	public NecessidadesEspeciais(@NotNull Integer codigo, @NotNull String nome, @NotNull String descricao,
			@NotNull String requisitos) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.requisitos = requisitos;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(String requisitos) {
		this.requisitos = requisitos;
	}

	public ArrayList<Alunos> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Alunos> alunos) {
		this.alunos = alunos;
	}

}

