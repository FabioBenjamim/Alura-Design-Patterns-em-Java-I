package br.com.alura.loja.orcamento.situacao;

public abstract class SituacaoMensagem {
	
	public String OrcamentoNaoPodeSerFinalizado() {
		return "Orcamento não pode ser finalizado!";
	}
	
	protected String OrcamentoNaoPodeTerDescontoExtra() {
		return "Orcamento reprovado não pode ter desconto extra!";
	}

}
