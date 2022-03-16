package br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;

public class CalculadoraDeCompra {
	
	public Money calcularValorTotal(Money subtotal, Money valorDoFrete, Desconto desconto) {
		if(subtotal.isZero()) return subtotal;
		subtotal = subtotal.subtract(desconto.getValor());
		subtotal = subtotal.add(valorDoFrete);
		return subtotal;
	}
}
