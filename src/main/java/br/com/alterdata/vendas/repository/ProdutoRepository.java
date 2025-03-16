package br.com.alterdata.vendas.repository;

import br.com.alterdata.vendas.model.Produto;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository {

    List<Produto> buscaTodosOsProdutos();

    Produto salvaProduto(Produto produto);

    Produto buscaProdutoPorId(Long idProduto);

    void deletaProduto(Produto produto);
}
