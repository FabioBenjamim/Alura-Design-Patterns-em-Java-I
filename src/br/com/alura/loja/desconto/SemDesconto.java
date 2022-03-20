package br.com.alura.loja.desconto;

import java.math.BigDecimal;

import br.com.alura.loja.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal efetuarCalculo(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public Boolean deveAplicar(Orcamento orcamento) {
		return true;
	}

}
