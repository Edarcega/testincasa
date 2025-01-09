package com.edstecno.testincasa.testincasa.config;

import com.edstecno.testincasa.testincasa.domain.entities.User;
import com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    UserService service;

    @Override
    public void run(String... args) throws Exception {
        User user = new User(null, "João da silva", "joao@gmail.com");

    }
}
