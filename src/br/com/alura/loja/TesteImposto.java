package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;

public class TesteImposto {
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
	}

}
