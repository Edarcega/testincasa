package com.edstecno.testincasa.testincasa.domain.entities.enums;

public enum TipoVendedor {

    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2),
    ASSOCIADO(3);

    private int code;

    private TipoVendedor(int code) {
        this.code = code;
    }

    private int getCode() {
        return code;
    }

    public static TipoVendedor tipoVendedorCode(int code) {
        for (TipoVendedor codigoTipo : TipoVendedor.values()) {
            if (codigoTipo.getCode() == code) {
                return codigoTipo;
            }
        }
        throw new IllegalArgumentException("Valor de tipo vendedo inválido");
    }


}
