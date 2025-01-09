package com.edstecno.testincasa.testincasa.application.UseCases;

import com.edstecno.testincasa.testincasa.domain.entities.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.User;

import java.util.List;

public interface PerfilUseCases {

    List<Perfil> findAll();
}
