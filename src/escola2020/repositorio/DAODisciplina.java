package escola2020.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Disciplina;

public interface DAODisciplina {
	
	public void inserir(Disciplina disc) throws SQLException;
	
	public ArrayList<Disciplina> listarTodas() throws SQLException;
	
	public void excluir(Integer id) throws SQLException;
	
	public Disciplina buscarPeloCodigo(Integer Codigo) throws SQLException;
}
