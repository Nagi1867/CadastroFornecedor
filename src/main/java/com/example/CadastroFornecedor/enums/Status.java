package com.example.CadastroFornecedor.enums;

public enum Status {
    INATIVO(0),
    ATIVO(1);

    private int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Status ValueOf(int code) {
        for(Status values : Status.values()) {
            if(values.getCode() == code) {
                return values;
            }
        }
        throw new IllegalArgumentException("Invalid status code");
    }
}
