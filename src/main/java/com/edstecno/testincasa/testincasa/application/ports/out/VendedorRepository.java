package com.edstecno.testincasa.testincasa.application.ports.out;

import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VendedorRepository extends MongoRepository<Vendedor, String> {
}
