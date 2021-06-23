package exercicio_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		CurrencyConverter calcula = new CurrencyConverter();
		
		calcula.IOF = 6f;
		
		System.out.println("===========COMPRA DE DOALR==========");
		System.out.println("Qual a cotação do dólar hoje ?");
		
		calcula.cotacao = scan.nextDouble();
		
		System.out.println("Quantos dólares queres comprar ?");
		calcula.dolarAComprar = scan.nextDouble();
		
		
		Double totalClaculado = calcula.calculate(calcula);
				
		System.out.printf("Total em Reais é: %.2f", totalClaculado);		
		
		
		

	}

}
