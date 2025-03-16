package br.com.alterdata.vendas.controller;

import br.com.alterdata.vendas.model.Produto;
import br.com.alterdata.vendas.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("produtos")
public class ProdutosController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/lista-produtos")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto> listar() {
        return produtoService.listar();
    }

    @PostMapping("/novo-produto")
    @ResponseStatus(HttpStatus.OK)
    public ProdutoResponse criaNovoProduto(@RequestBody @Valid ProdutoRequest request) {
        return produtoService.criaNovoProduto(request);
    }

    @GetMapping("/busca/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ProdutoDetalhadoResponse buscaProduto(@PathVariable("id") Long idProduto) {
        return produtoService.buscaProdutoPorId(idProduto);
    }
}
