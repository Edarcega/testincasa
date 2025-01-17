package com.edstecno.testincasa.testincasa.domain.entities;

import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serial;
import java.io.Serializable;

@Document(collection = "user")
public abstract class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -1604146369534819349L;

    @Id
    private String id;
    private String nome;
    private String email;
    private String senha;
    private String imagem;
    private Integer perfil;

    public User() {
    }

    public User(String id, String nome, String email, String senha, String imagem, Perfil perfil) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.imagem = imagem;
        setPerfil(perfil);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Perfil getPerfil() {
        return Perfil.perfilCode(perfil);
    }

    public void setPerfil(Perfil perfil) {
        if (perfil != null) {
            this.perfil = perfil.getCode();
        }
    }
}
