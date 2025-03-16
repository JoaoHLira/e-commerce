package br.com.alterdata.vendas.controller;

import br.com.alterdata.vendas.model.Produto;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProdutoDetalhadoResponse {

    private Long id;

    private String nome;

    private String descricao;

    private String referencia;

    private BigDecimal valorUnitario;

    public ProdutoDetalhadoResponse(Produto produto) {
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.referencia = produto.getReferencia();
        this.valorUnitario = produto.getValorUnitario();
    }
}
