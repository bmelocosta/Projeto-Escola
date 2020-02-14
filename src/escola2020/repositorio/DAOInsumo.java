package escola2020.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Insumos;

public interface DAOInsumo {
	
	public void inserir(Insumos insumo) throws SQLException;
	
	public ArrayList<Insumos> listarTodos() throws SQLException;
	
	public void excluir(Integer id) throws SQLException;
	
	public Insumos buscarPeloCodigo(Integer Codigo) throws SQLException;


}
