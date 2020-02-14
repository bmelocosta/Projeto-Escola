package escola2020.dominio;

import javax.validation.constraints.NotNull;

public class Insumos {

	@NotNull
	private int codigo;
	@NotNull
	private String nome;
	@NotNull
	private String descricao;
	@NotNull
	private int status;
	@NotNull
	private Double qtdeMinima;
	@NotNull
	private Double qtdeMaxima;
	@NotNull
	private Double qtdeAtual;
	@NotNull
	private int InsumoCategorias_codigo;
	@NotNull
	private InsumosCategorias categorias;
	
	public Insumos() {
		this.categorias=new InsumosCategorias();
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Double getQtdeMinima() {
		return qtdeMinima;
	}
	public void setQtdeMinima(Double qtdeMinima) {
		this.qtdeMinima = qtdeMinima;
	}
	public Double getQtdeMaxima() {
		return qtdeMaxima;
	}
	public void setQtdeMaxima(Double qtdeMaxima) {
		this.qtdeMaxima = qtdeMaxima;
	}
	public Double getQtdeAtual() {
		return qtdeAtual;
	}
	public void setQtdeAtual(Double qtdeAtual) {
		this.qtdeAtual = qtdeAtual;
	}
	public int getInsumoCategorias_codigo() {
		return InsumoCategorias_codigo;
	}
	public void setInsumoCategorias_codigo(int insumoCategorias_codigo) {
		InsumoCategorias_codigo = insumoCategorias_codigo;
	}
	public InsumosCategorias getCategorias() {
		return categorias;
	}
	public void setCategorias(InsumosCategorias categorias) {
		this.categorias = categorias;
	}
	
	
	
	
}
