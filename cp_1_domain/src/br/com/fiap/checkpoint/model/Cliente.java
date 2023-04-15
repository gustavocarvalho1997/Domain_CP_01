package br.com.fiap.checkpoint.model;

public class Cliente {
	//ATRIBUTOS
	private String nome, cpf, dataNasc, sexo;
	private int idCliente;
	private Endereco endereco;
	private Veiculo veiculo;
	
	//CONSTRUTOR
	public Cliente(int idCliente, String nome, String cpf, String dataNasc, String sexo
					, Endereco endereco, Veiculo veiculo) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.endereco = endereco;
		this.veiculo = veiculo;
		
	}
	
	//MÉTODOS
	public String retornarDadosCliente() {
		return "Id do Cliente:" + idCliente + ", Nome: " + nome + ", cpf: " + cpf 
				+ ", Data de nascimento: " + dataNasc + ", sexo: " + sexo;
	}
	
	
	public String retornarEnderecoCliente() {
		return endereco.retornarDadosEndereco();
	}
	
	
	public String retornarVeiculoCliente() {
		return veiculo.retornarDadosVeiculo();
	}
	
	public void imprimirDadosCliente() {
		System.out.println(retornarDadosCliente());
		System.out.println(retornarEnderecoCliente());
		System.out.println(retornarVeiculoCliente());
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

	public String getSexo() {
		return sexo;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public Veiculo getVeiculo() {
		return veiculo;
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

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
	
}
