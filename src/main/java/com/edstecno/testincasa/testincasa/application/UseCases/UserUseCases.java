package com.edstecno.testincasa.testincasa.application.UseCases;

import com.edstecno.testincasa.testincasa.domain.entities.User;
import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;

import java.util.List;

public interface UserUseCases {

    List<User> findAll();

    List<Vendedor> buscaVendedores();

    Vendedor buscaVendedor(String id);

}
