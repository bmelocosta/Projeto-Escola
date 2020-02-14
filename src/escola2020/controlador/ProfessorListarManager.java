package escola2020.controlador;

import java.io.Serializable;
import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import escola2020.dominio.Professor;
import escola2020.servico.ProfessorServico;
import escola2020.servico.ProfessorServicoException;
@SuppressWarnings("serial")
@Named
@RequestScoped
public class ProfessorListarManager implements Serializable{
	
		private Professor professor;
		private ProfessorServico servico;
		
		public ProfessorListarManager() {
			this.setProfessor(new Professor());
			this.servico = new ProfessorServico();
		}

		public Professor getProfessor() {
			return professor;
		}

		public void setProfessor(Professor funcionario) {
			this.professor = funcionario;
		}

		
		
		public ArrayList<Professor> getProfessores() throws ProfessorServicoException {
			try {
				return servico.listar();
			} catch (ProfessorServicoException exception) {
				FacesContext contexto = FacesContext.getCurrentInstance();
				FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, "ERRO :", exception.getMessage());
				contexto.addMessage(null, mensagem);
				return (new ArrayList<Professor>());
			}

		}

	}

