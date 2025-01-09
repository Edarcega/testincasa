package com.edstecno.testincasa.testincasa.application.ports.in;

import com.edstecno.testincasa.testincasa.application.UseCases.PerfilUseCases;
import com.edstecno.testincasa.testincasa.application.UseCases.UserUseCases;
import com.edstecno.testincasa.testincasa.domain.entities.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.PerfilService;
import com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PerfilPortIn implements PerfilUseCases {

    @Autowired
    PerfilService perfilService;

    @Override
    public List<Perfil> findAll() {
        return perfilService.findAll();
    }
}
