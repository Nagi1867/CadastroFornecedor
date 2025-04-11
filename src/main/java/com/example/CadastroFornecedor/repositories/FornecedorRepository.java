package com.example.CadastroFornecedor.repositories;

import com.example.CadastroFornecedor.entities.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
}
