package com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence;

import com.edstecno.testincasa.testincasa.application.ports.out.UserRepository;
import com.edstecno.testincasa.testincasa.application.ports.out.VendedorRepository;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;
import com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.Exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    VendedorRepository vendedorRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public List<Vendedor> findVendedores() {
        return vendedorRepository.findAll();
    }

    public Vendedor findVendedorById(String id) {
        Optional<Vendedor> vendedor = vendedorRepository.findById(id);
        return vendedor.orElseThrow(() -> new ObjectNotFoundException("Vendedor não encontrado"));
    }

}
