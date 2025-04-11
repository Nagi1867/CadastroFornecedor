package com.example.CadastroFornecedor.services;

import com.example.CadastroFornecedor.entities.Fornecedor;
import com.example.CadastroFornecedor.repositories.FornecedorRepository;
import com.example.CadastroFornecedor.services.exceptions.DatabaseException;
import com.example.CadastroFornecedor.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository repository;

    public List<Fornecedor> findAll() {
        return repository.findAll();
    }

    public Fornecedor findById(Long id) {
        Optional<Fornecedor> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Fornecedor insert(Fornecedor obj) {
        return repository.save(obj);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        }
        catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        }
        catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public Fornecedor update(Long id, Fornecedor obj) {
        try {
            Fornecedor entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        }
        catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(Fornecedor entity, Fornecedor obj) {
        entity.setNome(obj.getNome());
        entity.setCidade(obj.getCidade());
        entity.setCidade(obj.getCidade());
        entity.setStatus(obj.getStatus());
    }
}
