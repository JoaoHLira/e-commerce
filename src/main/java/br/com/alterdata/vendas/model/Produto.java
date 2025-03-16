package br.com.alterdata.vendas.model;

import br.com.alterdata.vendas.controller.ProdutoRequest;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "produtos")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private String descricao;

    @NotNull
    private String referencia;

    @NotNull
    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;

    public Produto(ProdutoRequest produto) {
        this.nome = produto.getNome();
        this.descricao = produto.getDescricao();
        this.referencia = produto.getReferencia();
        this.valorUnitario = produto.getValorUnitario();
    }
}
