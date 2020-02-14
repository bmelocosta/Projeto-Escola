package escola2020.dominio;

import javax.validation.constraints.NotNull;

public class CalendarioLetivo {
	
	@NotNull
	private Integer codigo;
	@NotNull
	private int ano;
	@NotNull
	private String dataInicio;
	@NotNull
	private String datafim;
	@NotNull
	private String evento;
	

	public CalendarioLetivo() {

	}

	public CalendarioLetivo(Integer codigo, int ano, String dataInicio, String datafim, String texto) {
		super();
		this.codigo = codigo;
		this.ano = ano;
		this.dataInicio = dataInicio;
		this.datafim = datafim;
		this.evento = texto;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getDatafim() {
		return datafim;
	}

	public void setDatafim(String datafim) {
		this.datafim = datafim;
	}

	public String getTexto() {
		return evento;
	}

	public void setTexto(String texto) {
		this.evento = texto;
	}

}
