package com.edstecno.testincasa.testincasa.application.ports.in;

import com.edstecno.testincasa.testincasa.application.UseCases.UserUseCases;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserPortIn implements UserUseCases {

    @Autowired
    UserService userService;

    @Override
    public List<User> findAll() {
        return userService.findAll();
    }
}
