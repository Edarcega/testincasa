package com.edstecno.testincasa.testincasa.config;

import com.edstecno.testincasa.testincasa.application.ports.out.ClienteRepository;
import com.edstecno.testincasa.testincasa.application.ports.out.UserRepository;
import com.edstecno.testincasa.testincasa.application.ports.out.VendedorRepository;
import com.edstecno.testincasa.testincasa.domain.entities.Cliente;
import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;
import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.enums.TipoVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    VendedorRepository vendedorRepository;

    @Autowired
    ClienteRepository clienteRepository;


    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        vendedorRepository.deleteAll();

        Vendedor vendedor = new Vendedor(null, "Zezinho", "zezinho@gmail.com", "1234*", "xpto", Perfil.VENDEDOR, null, TipoVendedor.PESSOA_FISICA);
        vendedorRepository.save(vendedor);

        Cliente c1 = new Cliente(null, "Huguinho", "huguinho@gmail.com", "senha", "img", Perfil.CLIENTE, null);
    }

}
