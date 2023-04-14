package br.com.fiap.checkpoint.model;

public class Veiculo {
	//ATRIBUTOS
	private String modelo, chassi, cor, tipo, placa;
	private int ano, renavam;
	
	//CONSTRUTOR
	public Veiculo(String tipo, String modelo, String cor, String placa, String chassi
					, int ano, int renavam ) {
		this.tipo = tipo;
		this.modelo = modelo;
		this.cor = cor;
		this.placa = placa;
		this.chassi = chassi;
		this.ano = ano;
		this.renavam = renavam;
	}
	
	//METODOS
	public String retornarDadosVeiculo() {
		return "Veículo: " + tipo + " " + modelo + ", cor: " + cor + ", placa: " 
				+ placa + ", chassi: " + chassi + ", ano: " + ano + ", renavam:"
				+ renavam;
	}
	
	
	//GETTERS
	public String getModelo() {
		return modelo;
	}

	public String getChassi() {
		return chassi;
	}

	public String getCor() {
		return cor;
	}

	public String getTipo() {
		return tipo;
	}

	public String getPlaca() {
		return placa;
	}

	public int getAno() {
		return ano;
	}

	public int getRenavam() {
		return renavam;
	}
	
	//SETTERS
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void setRenavam(int renavam) {
		this.renavam = renavam;
	}
	
	
}
