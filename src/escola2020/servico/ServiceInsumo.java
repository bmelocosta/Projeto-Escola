package escola2020.servico;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Insumos;
import escola2020.repositorio.DAOInsumo;
import escola2020.repositorio.DAOInsumoImpl;

public class ServiceInsumo {
	
	public ArrayList<Insumos> executeListarInsumos() throws PException{
		DAOInsumo dao = new DAOInsumoImpl();
		try {
			return dao.listarTodos();
		}
		catch(SQLException e) {
			throw new PException(e.getMessage());
		}
	}

}
