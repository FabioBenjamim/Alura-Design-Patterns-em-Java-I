package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento extends SituacaoMensagem {

	public abstract BigDecimal calcularDescontoExtra(Orcamento orcamento);
	
	public void aprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException(OrcamentoNaoPodeSerFinalizado());
	}
	
	public void reprovar(Orcamento orcamento) throws DomainException {
		throw new DomainException(OrcamentoNaoPodeSerFinalizado());
	}
	
	public void finalizar(Orcamento orcamento) throws DomainException {
		throw new DomainException(OrcamentoNaoPodeSerFinalizado());
	}

}
