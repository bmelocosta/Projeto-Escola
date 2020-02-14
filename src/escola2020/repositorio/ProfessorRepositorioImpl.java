package escola2020.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import escola2020.dominio.Alunos;

import escola2020.dominio.Professor;
import escola2020.util.GerenciadorConexao;
import escola2020.util.GerenciadorConexaoMysql;
import java.time.LocalDate;

public class ProfessorRepositorioImpl implements ProfessorRepositorio{
	
private final GerenciadorConexao gerenciador = GerenciadorConexaoMysql.getInstancia();
	
	
	
	@Override
	public ArrayList<Professor> getAll() throws SQLException{
		Connection conexao = gerenciador.conectar();
		String comandosql = "SELECT matricula, cpf, nome, sobrenome, sexo, dtNascimento, email,"
				+ "dtCadastro, status, telefone, endereco, cidade, uf, cep,valorHoraAula FROM professores ";
		Statement comando=conexao.createStatement();
		ResultSet resultado = comando.executeQuery(comandosql);
		ArrayList<Professor> lista = new ArrayList<>();
		Professor professor;
		while(resultado.next()) {
			professor = new Professor();
			professor.setMatricula(resultado.getString("matricula"));
			professor.setCpf(resultado.getString("cpf"));
			professor.setNome(resultado.getString("nome"));
			professor.setSobrenome(resultado.getString("sobrenome"));
			professor.setSexo(resultado.getString("sexo"));
			professor.setDtnascimento(resultado.getDate("dtNascimento"));			
			professor.setEmail(resultado.getString("email"));
			professor.setDtCadastro(resultado.getDate("dtCadastro"));
			professor.setStatus(resultado.getInt("status"));
			professor.setTelefone(resultado.getString("telefone"));
			professor.setEndereco(resultado.getString("endereco"));
			professor.setCidade(resultado.getString("cidade"));
			professor.setUf(resultado.getString("uf"));
			professor.setCep(resultado.getString("cep"));
			lista.add(professor);
		}
		gerenciador.desconectar(conexao);
		return lista;
	}



	@Override
	public void inserir(Professor funcionario) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void atualizar(Professor funcionario) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void excluir(String matricula) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Alunos get(String matricula) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}




	
}
