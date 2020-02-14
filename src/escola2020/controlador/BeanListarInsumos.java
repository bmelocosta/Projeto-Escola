package escola2020.controlador;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import escola2020.dominio.Insumos;
import escola2020.servico.PException;
import escola2020.servico.ServiceInsumo;

@SuppressWarnings("serial")
@Named @RequestScoped
public class BeanListarInsumos implements Serializable {
	
	private Insumos insumo;
	private ServiceInsumo serviceInsumos;
	
	public BeanListarInsumos () {
		serviceInsumos = new ServiceInsumo();
	}
	
	public Insumos getInsumo() {
		return insumo;
	}
	public void setInsumos(Insumos insumo) {
		this.insumo = insumo;
	}
	public ServiceInsumo getServiceInsumos() {
		return serviceInsumos;
	}
	public void setServiceInsumos(ServiceInsumo serviceInsumos) {
		this.serviceInsumos = serviceInsumos;
	}
	
	public ArrayList<Insumos> getInsumos() {
		try {
			return serviceInsumos.executeListarInsumos();
		}catch (PException e) {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERRO!", e.getMessage());
			context.addMessage(null, msg);
			return null;
		}
	}
	
	

}
