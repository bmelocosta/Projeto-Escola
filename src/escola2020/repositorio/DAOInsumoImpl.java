package escola2020.repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import escola2020.dominio.Insumos;
import escola2020.util.GerenciadorConexao;
import escola2020.util.GerenciadorConexaoMysql;

public class DAOInsumoImpl implements DAOInsumo {
	private GerenciadorConexao gerenciador;

	public DAOInsumoImpl() {
		gerenciador = new GerenciadorConexaoMysql();
	}

	@Override
	public void inserir(Insumos insumo) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Insumos> listarTodos() throws SQLException {
		Connection conn = gerenciador.conectar();

		String sql = "SELECT * FROM insumos";
		Statement stm = conn.createStatement();

		ResultSet rs = stm.executeQuery(sql);
		ArrayList<Insumos> InsumosList = new ArrayList<>();
		Insumos insumos;

		while (rs.next()) {
			insumos = new Insumos();
			insumos.setCodigo(rs.getInt("codigo"));
			insumos.setNome(rs.getString("nome"));
			insumos.setDescricao(rs.getString("descricao"));
			insumos.setStatus(rs.getInt("status"));
			insumos.setQtdeMinima(rs.getDouble("qtdeMinima"));
			insumos.setQtdeMinima(rs.getDouble("qtdeMaxima"));
			insumos.setInsumoCategorias_codigo(rs.getInt("InsumoCategorias_codigo"));
			InsumosList.add(insumos);
		}
		gerenciador.desconectar(conn);
		return InsumosList;
	}

	@Override
	public void excluir(Integer id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Insumos buscarPeloCodigo(Integer Codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
