package br.com.fiap.checkpoint.model;

public class Funcionario {
	//ATRIBUTOS
	private String nome, cpf, dataNasc, cargo, sexo, setor;
	private int idFunc;
	
	//CONSTRUTOR
	public Funcionario(int idFunc, String nome, String cpf, String dataNasc, 
						String sexo, String cargo, String setor) {
		
		this.idFunc = idFunc;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.cargo = cargo;
		this.setor = setor;
		
	}
	
	//METODOS
	public String retornarDadosFuncionario() {
		return "ID do funcionário: " + idFunc + ", nome: " + nome + ", CPF: " + cpf 
				+ ", sexo: " + sexo + ", cargo: " + cargo + ", setor: " + setor;
	}
	
	public void imprimirDadosFuncionario() {
		System.out.println(retornarDadosFuncionario());
	}
	
	

	//GETTERS
	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public String getCargo() {
		return cargo;
	}

	public String getSexo() {
		return sexo;
	}

	public String getSetor() {
		return setor;
	}

	public int getIdFunc() {
		return idFunc;
	}

	//SETTERS
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	
	
	
	
	
}
