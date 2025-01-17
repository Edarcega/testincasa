package com.edstecno.testincasa.testincasa.application.ports.out;

import com.edstecno.testincasa.testincasa.domain.entities.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository<Cliente, String> {
}
