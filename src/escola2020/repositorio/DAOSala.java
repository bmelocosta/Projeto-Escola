package escola2020.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Salas;

public interface DAOSala {
	
public void inserir(Salas salas) throws SQLException;
	
	public ArrayList<Salas> listarTodas() throws SQLException;
	
	public void excluir(Integer id) throws SQLException;
	
	public Salas buscarPeloCodigo(Integer Codigo) throws SQLException;

}
