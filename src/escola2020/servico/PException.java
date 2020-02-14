package escola2020.servico;

@SuppressWarnings("serial")
public class PException extends Exception{
	
	public PException (Throwable e) {
		super(e);
	}
	
	public PException (String str) {
		super(str);
	}
	
	public PException() {
		
	}

}
