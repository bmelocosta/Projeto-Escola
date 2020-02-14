package escola2020.servico;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Salas;
import escola2020.repositorio.DAOSala;
import escola2020.repositorio.DAOSalaImpl;

public class ServiceSala {
	
	public ArrayList<Salas> executeListarSalas() throws PException{
		DAOSala dao = new DAOSalaImpl();
		try {
			return dao.listarTodas();
		}
		catch(SQLException e) {
			throw new PException(e.getMessage());
		}
	}

}
