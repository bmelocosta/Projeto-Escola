package escola2020.controlador;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import escola2020.dominio.Fornecedores;
import escola2020.servico.PException;
import escola2020.servico.ServiceFornecedor;

@SuppressWarnings("serial")
@Named
@RequestScoped
public class BeanCadastroFornecedor implements Serializable {

	private Fornecedores fornecedor;
	private ServiceFornecedor servicoFornecedor;
	
	public BeanCadastroFornecedor() {
		servicoFornecedor = new ServiceFornecedor();
	}

	public Fornecedores getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedores fornecedor) {
		this.fornecedor = fornecedor;
	}

	public ServiceFornecedor getServicoFornecedor() {
		return servicoFornecedor;
	}

	public void setServicoFornecedor(ServiceFornecedor servicoFornecedor) {
		this.servicoFornecedor = servicoFornecedor;
	}

	public String cadastrar() {
		try {
			servicoFornecedor.executeCadastrar(this.fornecedor);
		} catch (PException e) {
			FacesContext fc = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro!", e.getMessage());
			fc.addMessage(null, msg);
			return null;
		}
		return "cadastroFornecedor.xhtml";
	}

}
