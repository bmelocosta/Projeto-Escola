package escola2020.servico;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Professor;
import escola2020.repositorio.ProfessorRepositorio;
import escola2020.repositorio.ProfessorRepositorioImpl;

public class ProfessorServico {

	private ProfessorRepositorio repositorio;

	public ProfessorServico() {
		this.repositorio = new ProfessorRepositorioImpl();
	}

	/**
	 * Valida e salva um funcionario no BD
	 * 
	 * @param usuario Objeto contendo todos os dados para inclusão
	 */

	/**
	 * Retorna um vetor com todos os dados do BD
	 * 
	 * @return arraylist de Funcionario com os elementos encontrados
	 * @throws FuncionarioServicoException
	 * 
	 */
	public ArrayList<Professor> listar() throws ProfessorServicoException {
		try {
			return this.repositorio.getAll();
		} catch (Exception exception) {
			throw new ProfessorServicoException(exception.getMessage());
		}
	}

	/**
	 * Valida e exclui um usuário no BD
	 * 
	 * @param ID identificador do registro a ser exluido
	 */
	public void excluir(String matricula) throws AlunoServicoException {
		try {
			this.repositorio.excluir(matricula);
		} catch (SQLException exception) {
			throw new AlunoServicoException(exception.getMessage());
		}
	}

	/**
	 * Valida e salva uma atualização do usuário no BD
	 * 
	 * @param usuario Objeto contendo todos os dados para inclusao, inclusive o ID
	 */

}
