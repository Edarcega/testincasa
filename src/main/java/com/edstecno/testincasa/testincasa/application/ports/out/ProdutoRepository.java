package com.edstecno.testincasa.testincasa.application.ports.out;

import com.edstecno.testincasa.testincasa.domain.entities.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProdutoRepository extends MongoRepository<Produto, String> {
}
