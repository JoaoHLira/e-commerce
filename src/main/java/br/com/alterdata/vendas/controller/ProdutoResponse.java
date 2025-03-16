package br.com.alterdata.vendas.controller;

import br.com.alterdata.vendas.model.Produto;
import lombok.Getter;

@Getter
public class ProdutoResponse {

    private Long id;

    public ProdutoResponse(Produto produto) {
        this.id = produto.getId();
    }
}
