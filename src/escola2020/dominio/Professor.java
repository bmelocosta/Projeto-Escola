package escola2020.dominio;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class Professor {
	@NotNull
	private String matricula;
	@NotNull
	private String cpf;
	@NotNull
	private String nome;
	@NotNull
	private String sobrenome;
	@NotNull
	private String sexo;
	@NotNull
	private Date dtnascimento;
	@NotNull
	@Email
	private String email;
	@NotNull
	private Date dtCadastro;
	@NotNull
	private int status;
	@NotNull
	private String telefone;
	@NotNull
	private String endereco;
	@NotNull
	private String cidade;
	@NotNull
	private String uf;
	@NotNull
	private String cep;
	@NotNull
	private Double valorHoraAula;

	private Titulacao titulacao;
	
	private ArrayList<Disciplina>disciplinas;


	public Professor() {
		this.titulacao = new Titulacao();
		this.disciplinas = new ArrayList<Disciplina>();
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getSobrenome() {
		return sobrenome;
	}


	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public  Date getDtnascimento() {
		return dtnascimento;
	}


	public void setDtnascimento(Date date) {
		this.dtnascimento = date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public @NotNull Date getDtCadastro() {
		return dtCadastro;
	}


	public void setDtCadastro(Date date) {
		this.dtCadastro = date;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public Double getValorHoraAula() {
		return valorHoraAula;
	}


	public void setValorHoraAula(Double valorHoraAula) {
		this.valorHoraAula = valorHoraAula;
	}


	public Titulacao getTitulacao() {
		return titulacao;
	}


	public void setTitulacao(Titulacao titulacao) {
		this.titulacao = titulacao;
	}


	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}


	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	

}
