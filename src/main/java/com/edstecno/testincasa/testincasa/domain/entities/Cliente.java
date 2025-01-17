package com.edstecno.testincasa.testincasa.domain.entities;

import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Document(collection = "cliente")
public class Cliente extends User implements Serializable {

    @Serial
    private static final long serialVersionUID = -6160108113364252679L;

    Pedido pedido;

    public Cliente(Pedido pedido) {
        this.pedido = pedido;
    }

    public Cliente(String id, String nome, String email, String senha, String imagem, Perfil perfil, Pedido pedido) {
        super(id, nome, email, senha, imagem, perfil);
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}
