package escola2020.dominio;

import java.util.Date;

public class Equipamentos {
	private int codigo;
	private String numeroOrdem;
	private String  nome;
	private  String descricao;
	private String marca;
	private Date dtAquisicao;
	private Double valorCompra;
	private int status;
	private Salas salas;
	private int salas_codigo;

	public Equipamentos() {
		this.salas = new Salas();
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumeroOrdem() {
		return numeroOrdem;
	}
	public void setNumeroOrdem(String numeroOrdem) {
		this.numeroOrdem = numeroOrdem;
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
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Date getDtAquisicao() {
		return dtAquisicao;
	}
	public void setDtAquisicao(Date dtAquisicao) {
		this.dtAquisicao = dtAquisicao;
	}
	public Double getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(Double valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Salas getSalas() {
		return salas;
	}
	public void setSalas(Salas salas) {
		this.salas = salas;
	}
	public int getSalas_codigo() {
		return this.salas.getCodigo();
	}
	public void setSalas_codigo(int salas_codigo) {
		salas.setCodigo(salas_codigo);
	}
	
	
}
