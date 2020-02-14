package escola2020.dominio;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

public class Funcionarios {
	
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
	
	private LocalDate dtNascimento;

	@NotNull
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
	private Cargos cargos;
	
	public Funcionarios() {
		this.cargos = new Cargos();
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

	public  LocalDate getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(LocalDate date) {
		this.dtNascimento = date;
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

	public Cargos getCargos() {
		return cargos;
	}

	public void setCargos(Cargos cargos) {
		this.cargos = cargos;
	}

	

	



}
