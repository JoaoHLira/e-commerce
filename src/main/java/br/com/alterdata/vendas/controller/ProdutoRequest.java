package br.com.alterdata.vendas.controller;

import com.sun.istack.NotNull;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ProdutoRequest {
    private String nome;

    @NotNull
    private String descricao;

    @NotNull
    private String referencia;

    @NotNull
    private BigDecimal valorUnitario;
}
