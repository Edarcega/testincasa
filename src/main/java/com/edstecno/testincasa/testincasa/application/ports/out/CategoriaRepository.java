package com.edstecno.testincasa.testincasa.application.ports.out;

import com.edstecno.testincasa.testincasa.domain.entities.Categoria;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoriaRepository extends MongoRepository<Categoria, String> {
}
