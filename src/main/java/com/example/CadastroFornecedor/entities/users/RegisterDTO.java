package com.example.CadastroFornecedor.entities.users;

import com.example.CadastroFornecedor.entities.enums.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
