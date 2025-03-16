package br.com.alterdata.vendas.repository;


import br.com.alterdata.vendas.handler.APIException;
import br.com.alterdata.vendas.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoInfraRepository implements ProdutoRepository {

    @Autowired
    private ProdutoSpringDataJPARepository produtoSpringDataJPARepository;

    @Override
    public List<Produto> buscaTodosOsProdutos() {
        return produtoSpringDataJPARepository.findAll();
    }

    @Override
    public Produto salvaProduto(Produto produto) {
        return produtoSpringDataJPARepository.save(produto);
    }

    @Override
    public Produto buscaProdutoPorId(Long idProduto) {
        return produtoSpringDataJPARepository.findById(idProduto)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
    }

    @Override
    public void deletaProduto(Produto produto) {
        produtoSpringDataJPARepository.delete(produto);
    }
}
