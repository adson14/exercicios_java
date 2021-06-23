package exercicio_1;

public class CurrencyConverter {
	
	public Double cotacao;
	public Double dolarAComprar;
	public Double totalEmReais;
	public Double imposto;
	public Double total;
	public static Float IOF;
	
	
	
	public Double calculate(CurrencyConverter dados) {
		
		totalEmReais = dados.dolarAComprar * dados.cotacao;
		imposto = dados.dolarAComprar * dados.IOF / 100; 
		
		total = dados.totalEmReais + dados.imposto;
		
		return total;
		
	}

}
