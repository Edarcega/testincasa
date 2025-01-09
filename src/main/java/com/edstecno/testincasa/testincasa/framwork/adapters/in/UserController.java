package com.edstecno.testincasa.testincasa.framwork.adapters.in;

import com.edstecno.testincasa.testincasa.application.ports.in.UserPortIn;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/users")
public class UserController {

    @Autowired
    UserPortIn userPortIn;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok().body(userPortIn.findAll());
    }

}
