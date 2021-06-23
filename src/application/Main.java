package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Endereco endereco = new Endereco();
		Scanner scan = new Scanner(System.in);		
		
		
		
		System.out.println("======================================");
		System.out.println("Escola uma das opções");
		System.out.println("======================================");
		
		System.out.println("[1] - Pessoa");
		System.out.println("[2] - Endereço");
		
		Integer opcao = scan.nextInt();
		
		switch(opcao) {
		
			case 1:
				montaPessoa(pessoa);
				break;
			case 2:
				montaEndereco(endereco);
			default:
				break;
		}

	}
	
	static void montaPessoa(Pessoa pessoa) {
		
		pessoa.nome = "Adson SOuza";
		pessoa.email = "ty.msn@hotmail.com";
		pessoa.idade = 25;
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Email: " + pessoa.email);
		System.out.println("Idade: " + pessoa.idade);
	}
	
	static void montaEndereco(Endereco endereco) {
		
		endereco.setLogradouro("Avenida josé faria da rocha");
		endereco.setNumero("4046");
		endereco.setBairro("Eldorado");
		endereco.setCidade("Contagem");
		endereco.setEstado("MG");
		
		System.out.println("Rua: " + endereco.getLogradouro());
		System.out.println("Numero: " + endereco.getNumero());
		System.out.println("Bairro: " + endereco.getBairro());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Estado: " + endereco.getEstado());
		
	}

}
