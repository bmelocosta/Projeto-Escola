package escola2020.servico;
@SuppressWarnings("serial")
public class ProfessorServicoException extends Exception{

	public ProfessorServicoException(Throwable exception) {
		super(exception);
	}
	public ProfessorServicoException(String mensagem) {
		super(mensagem);
	}
	public ProfessorServicoException() {
		super();
	}
}
