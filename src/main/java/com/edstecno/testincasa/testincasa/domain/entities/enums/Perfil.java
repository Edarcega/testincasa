package com.edstecno.testincasa.testincasa.domain.entities.enums;

public enum Perfil {
    ADMIN(1),
    LOJISTA(2),
    VENDEDOR(3),
    CLIENTE(4);

    private int code;

    private Perfil(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Perfil perfilCode(int code) {
        for (Perfil valor : Perfil.values()) {
            if (valor.getCode() == code) {
                return valor;
            }
        }
        throw new IllegalArgumentException("Valor de perfil inválido");
    }

}
