package com.edstecno.testincasa.testincasa.application.ports.out;

import com.edstecno.testincasa.testincasa.domain.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long> {

}
