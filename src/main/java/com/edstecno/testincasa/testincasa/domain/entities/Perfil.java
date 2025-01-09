package com.edstecno.testincasa.testincasa.domain.entities;


import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Objects;

@Document(collection = "perfil")
public class Perfil implements Serializable {


    private static final long serialVersionUID = 7977283042641159882L;

    String id;
    String nome;

    public Perfil() {
    }

    public Perfil(String id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perfil perfil = (Perfil) o;
        return Objects.equals(id, perfil.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}