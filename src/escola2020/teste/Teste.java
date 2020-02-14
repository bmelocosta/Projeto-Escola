package escola2020.teste;

import java.util.ArrayList;

import escola2020.dominio.Funcionarios;
import escola2020.dominio.Professor;
import escola2020.servico.FuncionarioServico;
import escola2020.servico.FuncionarioServicoException;
import escola2020.servico.ProfessorServico;
import escola2020.servico.ProfessorServicoException;

public class Teste {

	public static void main(String[] args) throws  ProfessorServicoException {
		ArrayList<Professor>teste = new ArrayList<>();
		ProfessorServico servico = new ProfessorServico();
		teste = servico.listar();
		for (Professor professor : teste) {
			System.out.println(professor.getNome());
		}
	}

}
