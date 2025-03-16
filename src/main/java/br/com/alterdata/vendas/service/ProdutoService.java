package br.com.alterdata.vendas.service;

import br.com.alterdata.vendas.controller.ProdutoAlteracaoRequest;
import br.com.alterdata.vendas.controller.ProdutoDetalhadoResponse;
import br.com.alterdata.vendas.controller.ProdutoRequest;
import br.com.alterdata.vendas.controller.ProdutoResponse;
import br.com.alterdata.vendas.handler.APIException;
import br.com.alterdata.vendas.model.Produto;
import br.com.alterdata.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listar() {
        return produtoRepository.buscaTodosOsProdutos();
    }

    public ProdutoResponse criaNovoProduto(ProdutoRequest request) {
        Produto produtoCriado = produtoRepository.salvaProduto(new Produto(request));
        return new ProdutoResponse(produtoCriado);
    }

    public ProdutoDetalhadoResponse buscaProdutoPorId(Long idProduto) {
        Produto produto = produtoRepository.buscaProdutoPorId(idProduto);
        return new ProdutoDetalhadoResponse(produto);
    }

    public void deletaProdutoPorId(Long idProduto) {
        Produto produto = produtoRepository.buscaProdutoPorId(idProduto);
        produtoRepository.deletaProduto(produto);
    }

    public void alteraProduto(Long idProduto, ProdutoAlteracaoRequest alteracaoRequest) {
        Produto produto = produtoRepository.buscaProdutoPorId(idProduto);
        produto.alteraDadosDoProduto(alteracaoRequest);
        produtoRepository.salvaProduto(produto);
    }
}
