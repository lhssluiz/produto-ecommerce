package com.letscode.produtoecommerce.repository;

import com.letscode.produtoecommerce.domain.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
