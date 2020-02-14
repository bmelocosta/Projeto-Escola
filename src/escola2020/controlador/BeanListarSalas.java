package escola2020.controlador;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import escola2020.dominio.Salas;
import escola2020.servico.PException;
import escola2020.servico.ServiceSala;

@SuppressWarnings("serial")
@Named 
@RequestScoped
public class BeanListarSalas implements Serializable {
	
	private Salas sala;
	private ServiceSala serviceSala;
	
	public BeanListarSalas() {
		serviceSala = new ServiceSala();
	}

	public Salas getSala() {
		return sala;
	}

	public void setSala(Salas sala) {
		this.sala = sala;
	}

	public ServiceSala getServiceSala() {
		return serviceSala;
	}

	public void setServiceSala(ServiceSala serviceSala) {
		this.serviceSala = serviceSala;
	}
	
	public ArrayList<Salas> getSalas(){
		try {
			return serviceSala.executeListarSalas();
		}
		catch(PException e) {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERRO!", e.getMessage());
			context.addMessage(null, msg);
			return null;
		}
	}

}
