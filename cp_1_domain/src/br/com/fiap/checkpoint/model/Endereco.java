package br.com.fiap.checkpoint.model;

public class Endereco {
	//ATRIBUTOS
	private String logradouro, cep, cidade;
	private int numero;
	
	//CONSTRUTORES
	public Endereco(String logradouro, int numero, String cep, String cidade) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	//MÉTODO
	public String retornarDadosEndereco() {
		return "Logradouro: " + logradouro + ", Nº: " + numero + ", CEP: " 
				+ cep + ", Cidade: " + cidade;
	}

	//GETTERS
	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getCidade() {
		return cidade;
	}

	public int getNumero() {
		return numero;
	}

	//SETTERS
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}
