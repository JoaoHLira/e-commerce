package br.com.alterdata.vendas.controller;

import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProdutoAlteracaoRequest {

    private String nome;

    private String descricao;

    private String referencia;

    private BigDecimal valorUnitario;

}
