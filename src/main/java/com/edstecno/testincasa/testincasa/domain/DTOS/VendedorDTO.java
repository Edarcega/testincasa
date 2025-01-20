package com.edstecno.testincasa.testincasa.domain.DTOS;

import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;
import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;

import java.io.Serializable;

public class VendedorDTO implements Serializable {
    private static final long serialVersionUID = -3765077743721472215L;

    private String id;
    private String nome;
    private String email;
    private String imagem;
    private Perfil perfil;


    public VendedorDTO(Vendedor user) {
        this.id = user.getId();
        this.nome = user.getNome();
        this.email = user.getEmail();
        this.imagem = user.getImagem();
        this.perfil = user.getPerfil();
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

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
