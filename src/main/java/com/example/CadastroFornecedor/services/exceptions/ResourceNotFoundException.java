package com.example.CadastroFornecedor.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long SerialVersionUID = 1L;

    public ResourceNotFoundException(Long id) {
        super("Resource not found. Id: " + id);
    }
}
