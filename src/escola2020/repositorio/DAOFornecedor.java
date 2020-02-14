package escola2020.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Fornecedores;

public interface DAOFornecedor {
	
	public void inserir(Fornecedores forn) throws SQLException;
	
	public ArrayList<Fornecedores> listarTodos() throws SQLException;
	
	public void excluir(Integer id) throws SQLException;
	
	public Fornecedores buscarPeloCodigo(Integer Codigo) throws SQLException;

}
