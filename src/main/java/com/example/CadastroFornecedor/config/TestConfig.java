package com.example.CadastroFornecedor.config;

import com.example.CadastroFornecedor.entities.Fornecedor;
import com.example.CadastroFornecedor.enums.Status;
import com.example.CadastroFornecedor.repositories.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private FornecedorRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Fornecedor fornecedor = new Fornecedor(null, "Josepi", "SP", "24546456456", Status.ATIVO);
        repository.save(fornecedor);
    }
}
