package com.edstecno.testincasa.testincasa.config;

import com.edstecno.testincasa.testincasa.application.ports.out.PerfilRepository;
import com.edstecno.testincasa.testincasa.application.ports.out.UserRepository;
import com.edstecno.testincasa.testincasa.domain.entities.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PerfilRepository perfilRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        Perfil vendedor = new Perfil(null, "Vendedor");
        Perfil admin = new Perfil(null, "Admin");
        perfilRepository.saveAll(Arrays.asList(vendedor, admin));


        User a = new User(null, "João da silva", "joao@gmail.com");
        a.getPerfil().addAll(Arrays.asList(vendedor, admin));

        userRepository.saveAll(Arrays.asList(a));

    }
}
