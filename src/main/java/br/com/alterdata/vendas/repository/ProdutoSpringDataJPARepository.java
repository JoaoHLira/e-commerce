package br.com.alterdata.vendas.repository;

import br.com.alterdata.vendas.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoSpringDataJPARepository extends JpaRepository<Produto, Long> {
}
