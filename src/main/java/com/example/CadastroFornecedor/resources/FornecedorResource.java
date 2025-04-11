package com.example.CadastroFornecedor.resources;

import com.example.CadastroFornecedor.entities.Fornecedor;
import com.example.CadastroFornecedor.services.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fornecedores")
public class FornecedorResource {
    @Autowired
    private FornecedorService service;

    @GetMapping
    public ResponseEntity<List<Fornecedor>> findAll() {
        List<Fornecedor> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Fornecedor> findById(@PathVariable Long id) {
        Fornecedor obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
