package escola2020.dominio;

import java.util.ArrayList;

import javax.validation.constraints.NotNull;

public class Cursos{
	@NotNull
	private Integer codigo;
	@NotNull
	private String nome;
	@NotNull
	private String descricao;
	@NotNull
	private Integer status;
	@NotNull
	private Integer qtdeMinimaAlunos;
	@NotNull
	private Integer qtdeMaximaAlunos;
	@NotNull
	private Double valorCusto;
	@NotNull
	private Double valorVenda;
	@NotNull
	private ArrayList<Disciplina> listDisciplina;
	
	
	public Cursos() {
		listDisciplina = new ArrayList<>();
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getQtdeMinimaAlunos() {
		return qtdeMinimaAlunos;
	}

	public void setQtdeMinimaAlunos(Integer qtdeMinimaAlunos) {
		this.qtdeMinimaAlunos = qtdeMinimaAlunos;
	}

	public Integer getQtdeMaximaAlunos() {
		return qtdeMaximaAlunos;
	}

	public void setQtdeMaximaAlunos(Integer qtdeMaximaAlunos) {
		this.qtdeMaximaAlunos = qtdeMaximaAlunos;
	}

	public Double getValorCusto() {
		return valorCusto;
	}

	public void setValorCusto(Double valorCusto) {
		this.valorCusto = valorCusto;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	

}
