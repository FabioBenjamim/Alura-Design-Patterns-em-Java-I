package br.com.alura.loja.orcamento.situacao;

public abstract class SituacaoMensagem {
	
	public String OrcamentoNaoPodeSerFinalizado() {
		return "Orcamento n�o pode ser finalizado!";
	}
	
	protected String OrcamentoNaoPodeTerDescontoExtra() {
		return "Orcamento reprovado n�o pode ter desconto extra!";
	}

}
