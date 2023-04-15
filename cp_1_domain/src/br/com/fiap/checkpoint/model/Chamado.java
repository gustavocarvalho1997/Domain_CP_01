package br.com.fiap.checkpoint.model;

import java.util.Scanner;

public class Chamado {
	private Funcionario funcionario;
	private Cliente cliente;
	private String logradouro, cep, referencia;
	private int codChamado;
	private boolean statusChamado;
	
	
	//CONSTRUTOR
	public Chamado() {
		
	}
	
	public Chamado(int codChamado, String logradouro, String cep, String referencia) {
		this.codChamado = codChamado;
		this.logradouro = logradouro;
		this.cep = cep;
		this.referencia = referencia;
		
	}
	
	
	public Chamado(Funcionario funcionario, Cliente cliente, int codChamado, 
					String logradouro, String cep, String referencia) {
		this.funcionario = funcionario;
		this.cliente = cliente;
		this.codChamado = codChamado;
		this.logradouro = logradouro;
		this.cep = cep;
		this.referencia = referencia;
		
	}
	
	//METODOS
	public void abrirChamado() {
		statusChamado = true;
	}
	public void fecharChamado() {
		statusChamado = false;
	}

	public void incluirDadosChamado(){
		Scanner leitor = new Scanner(System.in);
		System.out.println("Inclua o código do chamado: ");
		int codChamado = leitor.nextInt();
		System.out.println("Inclua o logradouro ou local do ocorrido: ");
		String logradouro = leitor.next();
		System.out.println("Inclua o CEP: ");
		String cep = leitor.next();
		System.out.println("Inclua uma referencia: ");
		String referencia = leitor.next();	
		
		setCodChamado(codChamado);
		setLogradouro(logradouro);
		setCep(cep);
		setReferencia(referencia);
		
		leitor.close();
	}
	
	
	//GETTERS
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public String getCep() {
		return cep;
	}

	public String getReferencia() {
		return referencia;
	}

	public int getCodChamado() {
		return codChamado;
	}

	public boolean isStatusChamado() {
		return statusChamado;
	}
	
	//SETTERS
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setCodChamado(int codChamado) {
		this.codChamado = codChamado;
	}

	public void setStatusChamado(boolean statusChamado) {
		this.statusChamado = statusChamado;
	}
	
	
	
	
	
	
}
