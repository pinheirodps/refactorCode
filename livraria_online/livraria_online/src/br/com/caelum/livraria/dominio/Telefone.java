package br.com.caelum.livraria.dominio;

public class Telefone {
	
	private final String ddd;
	private final String numero;
	
	public Telefone(String ddd, String numero) {
		this.ddd = ddd;
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return String.format("(%s) %s", ddd, numero); 
	}
}
