package escola2020.dominio;

import java.util.ArrayList;

import javax.validation.constraints.NotNull;

public class Disciplina {
	@NotNull
	private Integer codigo;
	@NotNull
	private String nome;
	@NotNull
	private Integer status;
	@NotNull
	private String descricao;
	@NotNull
	private String ementa;
	@NotNull
	private String bibliografia;
	@NotNull
	private Double cargaHoraria;
	@NotNull
	private ArrayList<Cursos> listCurso;
	@NotNull
	private ArrayList<Professor> listProfessor;
	
	public Disciplina() {
		listCurso = new ArrayList<>();
		listProfessor = new ArrayList<>();
	}
	
	public Disciplina(Integer codigo, String nome, Integer status, String descricao, String ementa, String bibliografia,
			Double cargaHoraria) {
		this.codigo = codigo;
		this.nome = nome;
		this.status = status;
		this.descricao = descricao;
		this.ementa = ementa;
		this.bibliografia = bibliografia;
		this.cargaHoraria = cargaHoraria;
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
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEmenta() {
		return ementa;
	}
	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}
	public String getBibliografia() {
		return bibliografia;
	}
	public void setBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	public Double getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
}
