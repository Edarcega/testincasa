package com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence;

import com.edstecno.testincasa.testincasa.application.ports.out.PerfilRepository;
import com.edstecno.testincasa.testincasa.application.ports.out.UserRepository;
import com.edstecno.testincasa.testincasa.domain.entities.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public List<Perfil> findAll() {
        return perfilRepository.findAll();
    }

}
