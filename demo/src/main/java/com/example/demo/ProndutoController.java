package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class ProndutoController {

    @RestController
    @RequestMapping("/api/produtos")
    public class ProdutoController {
    
        @Autowired
        private ProdutoRepository produtoRepository;
    
        @GetMapping
        public List<Produto> listarProdutos() {
            return produtoRepository.findAll();
        }
    
        @PostMapping
        public Produto criarProduto(@RequestBody Produto produto) {
            return produtoRepository.save(produto);
        }
    
        // outros endpoints para atualizar, deletar, etc.
    }
}