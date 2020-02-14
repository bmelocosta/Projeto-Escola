package escola2020.repositorio;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Alunos;
import escola2020.dominio.Professor;


public interface ProfessorRepositorio {
	
	public void inserir(Professor professor) throws SQLException;
	
	public void atualizar(Professor professor) throws SQLException;
	
	public void excluir(String matricula) throws SQLException;

	public Alunos get(String matricula) throws SQLException;
		/**
	 * Retorna um vetor com todos os registros do BD
	 * @return ArrayList<ProfessorsProfessors funcionario> com todos os registros, ou um objeto vazio
	 * @throws SQLException
	 */
	public ArrayList<Professor> getAll() throws SQLException;
}
