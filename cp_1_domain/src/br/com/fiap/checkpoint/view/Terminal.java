package br.com.fiap.checkpoint.view;
import br.com.fiap.checkpoint.model.Chamado;
import br.com.fiap.checkpoint.model.Cliente;
import br.com.fiap.checkpoint.model.Endereco;
import br.com.fiap.checkpoint.model.Funcionario;
import br.com.fiap.checkpoint.model.Veiculo;

public class Terminal {

	public static void main(String[] args) {
		//Instanciando Endereço
		Endereco endereco = new Endereco("Cândida de Carvalho", 477, "08041-030", "São Paulo");
		//Instanciando Veiculo
		Veiculo veiculo = new Veiculo("Caminhão ", "Volvo FH 540", "preto",
				"BEE 4R22", "LJCPCBLCX11000237", 2020, 12345678958l);
		//Instanciando Cliente
		Cliente cliente = new Cliente(552364, "Ronald", "123.456.789-22", "27/05/2000",
				"masculino", endereco, veiculo);
		//Instanciando Funcionário
		Funcionario funcionario = new Funcionario(552466, "Gustavo", "123.458.782-55",
				"02/02/2000", "masculino", "Help Desk", "Tecnologia");
		//Instanciando Chamado
		Chamado chamado = new Chamado();
		
		
		//incluindo dados no chamado
		chamado.incluirDadosChamado();
		//vinculando funcionário ao chamado
		chamado.setFuncionario(funcionario);
		//vinculando cliente ao chamado
		chamado.setCliente(cliente);
		
		//abrindo chamado
		chamado.abrirChamado();
				
		//imprimindo dados do cliente
		cliente.imprimirDadosCliente();
		//imprimindo dados do funcionário
		funcionario.imprimirDadosFuncionario();
		
		//imprimindo dados do chamado
		System.out.println("O chamado foi aberto com sucesso, seguem os dados de funcionário responsário, cliente segurado e o código do seu chamado!");
		System.out.println("Funcionário responsável: " + funcionario.getNome());
		System.out.println("Cliente segurado: " + cliente.getNome());
		System.out.println("Código do chamado: " + chamado.getCodChamado());
		
		
		
	}

}
