package com.edstecno.testincasa.testincasa.domain.entities;

import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.enums.TipoVendedor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "vendedor")
final public class Vendedor extends User {

    @DBRef
    private List<Pedido> pedidos = new ArrayList<>();

    private TipoVendedor tipoVendedor;

    private List<Produto> produtos = new ArrayList<>();

    public Vendedor() {
        super();
    }

    public Vendedor(String id, String nome, String email, String senha, String imagem, Perfil perfil, TipoVendedor tipoVendedor) {
        super(id, nome, email, senha, imagem, perfil);
        this.tipoVendedor = tipoVendedor;
    }

    public Vendedor(TipoVendedor tipoVendedor) {
        this.tipoVendedor = tipoVendedor;
    }

    public Vendedor(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
