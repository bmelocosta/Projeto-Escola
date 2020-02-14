package escola2020.repositorio;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import escola2020.dominio.Disciplina;
import escola2020.util.GerenciadorConexao;
import escola2020.util.GerenciadorConexaoMysql;

public class DAODisciplinaImpl implements DAODisciplina {
	private GerenciadorConexao gerenciador;
	
	public DAODisciplinaImpl() {
		gerenciador = new GerenciadorConexaoMysql();
	}

	@Override
	public void inserir(Disciplina disc) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public ArrayList<Disciplina> listarTodas() throws SQLException {
		Connection conn = gerenciador.conectar();

		String sql = "SELECT * FROM disciplinas";
		Statement stm = conn.createStatement();

		ResultSet rs = stm.executeQuery(sql);
		ArrayList<Disciplina> disciplinaList = new ArrayList<>();
		Disciplina disc;

		while (rs.next()) {
			disc = new Disciplina();
			disc.setCodigo(rs.getInt("codigo"));
			disc.setNome(rs.getString("nome"));
			disc.setCargaHoraria(rs.getDouble("cargaHoraria"));
			disc.setBibliografia(rs.getString("bibliografia"));
			disc.setDescricao(rs.getString("descricao"));
			disc.setEmenta(rs.getString("ementa"));
			disc.setStatus(rs.getInt("status"));
			disciplinaList.add(disc);
		}
		gerenciador.desconectar(conn);
		return disciplinaList;
	}

	@Override
	public void excluir(Integer id) throws SQLException {
		// TODO Auto-generated method stub

	}

	@Override
	public Disciplina buscarPeloCodigo(Integer Codigo) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
