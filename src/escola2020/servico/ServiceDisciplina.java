package escola2020.servico;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Disciplina;
import escola2020.repositorio.DAODisciplina;
import escola2020.repositorio.DAODisciplinaImpl;

public class ServiceDisciplina {
	
	public ArrayList<Disciplina> executeListarDisciplina() throws PException{
		DAODisciplina dao = new DAODisciplinaImpl();
		try {
			return dao.listarTodas();
		}
		catch(SQLException e) {
			throw new PException(e.getMessage());
		}
	}

}
