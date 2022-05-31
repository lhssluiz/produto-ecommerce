package com.letscode.produtoecommerce.controller;

import com.letscode.produtoecommerce.domain.Produto;
import com.letscode.produtoecommerce.repository.ProdutoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/produto")
public class ProdutoController {

    private final ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping(path = "/adicionar")
    public @ResponseBody String adicionarNovoProduto(@RequestParam String nome, @RequestParam Double preco, @RequestParam Integer quantidade){
        Produto produto = new Produto();

        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        produtoRepository.save(produto);

        return "Novo produto adicionado";
    }

    @GetMapping(path = "/listar-produtos") public @ResponseBody Iterable<Produto> getAllProdutos(){
        return produtoRepository.findAll();
    }
}
