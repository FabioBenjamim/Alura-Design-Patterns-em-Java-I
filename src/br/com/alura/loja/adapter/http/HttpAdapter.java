package br.com.alura.loja.adapter.http;

import java.util.Map;

public interface HttpAdapter {

    void post(String url, Map<String, Object> dados);

}

