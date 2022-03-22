package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.adapter.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        if(!orcamento.isFizalizado()){
            throw new DomainException("Orcamento não foi finalizado");
        }
        String url = "http://api.externa.teste/orcamento";
        Map<String , Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidades", orcamento.getQuantidadeItens()
        );

        http.post(url, dados);
    }

}
