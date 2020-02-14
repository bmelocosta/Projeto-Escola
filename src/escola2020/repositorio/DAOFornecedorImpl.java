package escola2020.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import escola2020.dominio.Fornecedores;
import escola2020.util.GerenciadorConexao;
import escola2020.util.GerenciadorConexaoMysql;

public class DAOFornecedorImpl implements DAOFornecedor{
	
	private GerenciadorConexao gerenciador;
	
	public DAOFornecedorImpl() {
		gerenciador = new GerenciadorConexaoMysql();
	}

	@Override
	public void inserir(Fornecedores forn) throws SQLException {
		Connection conn = gerenciador.conectar();
		
		String sql = "INSERT INTO fornecedores (nome, status) VALUES (?,?)";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setString(1, forn.getNome());
		pst.setInt(2, forn.getStatus());
		pst.executeUpdate();
		
		gerenciador.desconectar(conn);
	}

	
	@Override
	public ArrayList<Fornecedores> listarTodos() throws SQLException {
		Connection conn = gerenciador.conectar();
		
		String sql = "SELECT * FROM fornecedores";
		Statement stm = conn.createStatement();
		
		ResultSet rs = stm.executeQuery(sql);
		ArrayList<Fornecedores> fornecedorList = new ArrayList<>();
		Fornecedores forn;
		
		while(rs.next()) {
			forn = new Fornecedores();
			forn.setCodigo(rs.getInt("codigo"));
			forn.setNome(rs.getString("nome"));
			forn.setStatus(rs.getInt("status"));
			fornecedorList.add(forn);
		}
		gerenciador.desconectar(conn);
		return fornecedorList;
	}
	

	@Override
	public void excluir(Integer id) throws SQLException {
		
		
	}
	

	@Override
	public Fornecedores buscarPeloCodigo(Integer Codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
