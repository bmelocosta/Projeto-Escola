package escola2020.dominio;

import javax.validation.constraints.NotNull;

public class FornecedorInsumo {

	@NotNull
	private int fornecedores_codigo;
	@NotNull
	private int insumos_codigo;
	private Fornecedores fornecedor;
	private Insumos insumo;
	
	public FornecedorInsumo() {
		this.fornecedor=new Fornecedores();
		this.insumo =new Insumos();
	}
	
	public int getFornecedores_codigo() {
		return fornecedor.getCodigo();
	}
	public void setFornecedores_codigo(int fornecedores_codigo) {
		this.fornecedor.setCodigo(fornecedores_codigo);
	}
	public int getInsumos_codigo() {
		return insumo.getCodigo();
	}
	public void setInsumos_codigo(int insumos_codigo) {
		this.insumo.setCodigo(insumos_codigo);
	}
	public Fornecedores getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedores fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Insumos getInsumo() {
		return insumo;
	}
	public void setInsumo(Insumos insumo) {
		this.insumo = insumo;
	}
	
	
	
	
	
}
