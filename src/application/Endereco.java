package application;

public class Endereco {

	private String Logradouro;
	private String Numero;
	private String Bairro;
	private String Cidade;
	private String Estado;
	
	
	void setLogradouro(String Logradouro) {
		this.Logradouro = Logradouro;
	}
	
	void setNumero(String Numero) {
		this.Numero = Numero;
	}
	
	void setBairro(String Bairro) {
		this.Bairro = Bairro;
	}
	
	void setCidade(String Cidade) {
		this.Cidade = Cidade;
	}
	
	void setEstado(String Estado) {
		this.Estado = Estado;
	}
	
	String getLogradouro() {
		
		return this.Logradouro;
	}
	
	String getNumero() {
		return this.Numero;
	}
	
	String getBairro() {
		return this.Bairro;
	}
	
	String getCidade() {
		return this.Cidade;
	}
	
	String getEstado() {
		return this.Estado;
	}

}
