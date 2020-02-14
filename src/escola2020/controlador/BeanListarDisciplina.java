package escola2020.controlador;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import escola2020.dominio.Disciplina;
import escola2020.servico.PException;
import escola2020.servico.ServiceDisciplina;

@SuppressWarnings("serial")
@Named @RequestScoped
public class BeanListarDisciplina implements Serializable {

	private Disciplina disciplina;
	private ServiceDisciplina serviceDisciplina;
	
	public BeanListarDisciplina () {
		serviceDisciplina = new ServiceDisciplina();
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	public ServiceDisciplina getServiceDisciplina() {
		return serviceDisciplina;
	}
	public void setServiceDisciplina(ServiceDisciplina serviceDisciplina) {
		this.serviceDisciplina = serviceDisciplina;
	}
	
	public ArrayList<Disciplina> getDisciplinas(){
		try {
			return serviceDisciplina.executeListarDisciplina();
		}
		catch(PException e) {
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,"ERRO!", e.getMessage());
			context.addMessage(null, msg);
			return null;
		}
	}
	
	
}
