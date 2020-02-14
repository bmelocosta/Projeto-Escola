package escola2020.servico;

public class LivroServicoException extends Exception {

	public LivroServicoException(Throwable exception) {
		super(exception);
	}

	public LivroServicoException(String mensagem) {
		super(mensagem);
	}

	public LivroServicoException() {
		super();

	}
}
