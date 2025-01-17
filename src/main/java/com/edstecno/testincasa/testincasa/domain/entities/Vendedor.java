package com.edstecno.testincasa.testincasa.domain.entities;

import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "vendedor")
final public class Vendedor extends User {

    @DBRef
    List<Pedido> pedidos = new ArrayList<>();


    public Vendedor() {
        super();
    }

    public Vendedor(String id, String nome, String email, String senha, String imagem, Perfil perfil, List<Pedido> pedidos) {
        super(id, nome, email, senha, imagem, perfil);
        this.pedidos = pedidos;
    }

    public Vendedor(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
