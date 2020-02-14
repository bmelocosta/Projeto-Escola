package escola2020.servico;

import java.sql.SQLException;
import java.util.ArrayList;

import escola2020.dominio.Fornecedores;
import escola2020.repositorio.DAOFornecedor;
import escola2020.repositorio.DAOFornecedorImpl;

public class ServiceFornecedor {
	
	//Instancia a implementação da interface DAO, e está pronto para ser chamado pelo Bean
	public void executeCadastrar(Fornecedores fornecedor) throws PException {
		DAOFornecedor dao = new DAOFornecedorImpl();
		try {
			dao.inserir(fornecedor);
		}catch(SQLException e) {
			throw new PException(e.getMessage());
		}
	}
	
	public ArrayList<Fornecedores> executeListarFornecedor() throws PException {
		DAOFornecedor dao = new DAOFornecedorImpl();
		try {
			return dao.listarTodos();
		}
		catch(SQLException e) {
			throw new PException(e.getMessage());
		}
	}
	
	
	
}
