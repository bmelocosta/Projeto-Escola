package escola2020.repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import escola2020.dominio.Salas;
import escola2020.util.GerenciadorConexao;
import escola2020.util.GerenciadorConexaoMysql;

public class DAOSalaImpl implements DAOSala {
	private GerenciadorConexao gerenciador;
	
	public DAOSalaImpl() {
		gerenciador = new GerenciadorConexaoMysql();
	}

	@Override
	public void inserir(Salas salas) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Salas> listarTodas() throws SQLException {
		Connection conn = gerenciador.conectar();
		
		String sql = "SELECT * FROM salas";
		Statement stmt = conn.createStatement();
		
		ResultSet rs = stmt.executeQuery(sql);
		ArrayList<Salas> salaList = new ArrayList<>();
		Salas salas;
		
		while(rs.next()) {
			salas = new Salas();
			salas.setCodigo(rs.getInt("codigo"));
			salas.setNome(rs.getString("nome"));
			salas.setStatus(rs.getInt("status"));
			salaList.add(salas);
		}
		gerenciador.desconectar(conn);
		return salaList;
	}

	@Override
	public void excluir(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Salas buscarPeloCodigo(Integer Codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
