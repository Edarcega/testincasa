package com.edstecno.testincasa.testincasa.config;

import com.edstecno.testincasa.testincasa.application.ports.out.*;
import com.edstecno.testincasa.testincasa.domain.entities.Categoria;
import com.edstecno.testincasa.testincasa.domain.entities.Produto;
import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;
import com.edstecno.testincasa.testincasa.domain.entities.enums.Perfil;
import com.edstecno.testincasa.testincasa.domain.entities.enums.TipoVendedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Config implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    VendedorRepository vendedorRepository;

    @Autowired
    ProdutoRepository produtoRepository;

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public void run(String... args) throws Exception {
        produtoRepository.deleteAll();
        categoriaRepository.deleteAll();
        vendedorRepository.deleteAll();

        Categoria cat1 = new Categoria(null, "Eletronicos");
        Categoria cat2 = new Categoria(null, "Livros");
        Categoria cat3 = new Categoria(null, "Roupas");
        Categoria cat4 = new Categoria(null, "Acessórios");

        categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4));

        Produto p1 = new Produto(null, "Calça Jeans", "Calça Jeans tamanho M", 120.00, 20, "xyz");
        p1.getCategorias().add(cat3);
        Produto p2 = new Produto(null, "Como entender a bíblia", "Livro de Antonio Gusso", 60.00, 10, "xyz");
        p2.getCategorias().add(cat2);
        produtoRepository.saveAll(Arrays.asList(p1, p2));
        Vendedor v1 = new Vendedor(null, "Zézinho", "zézinho@gmail.com", "19654324", "xyz", Perfil.VENDEDOR, TipoVendedor.PESSOA_FISICA);
        v1.getProdutos().addAll(Arrays.asList(p1, p2));
        Vendedor v2 = new Vendedor(null, "Zézinho", "zézinho@gmail.com", "19654324", "xyz", Perfil.VENDEDOR, TipoVendedor.ASSOCIADO);
        v2.getProdutos().addAll(Arrays.asList(p2));
        Vendedor v3 = new Vendedor(null, "Zézinho", "zézinho@gmail.com", "19654324", "xyz", Perfil.VENDEDOR, TipoVendedor.PESSOA_JURIDICA);
        v3.getProdutos().addAll(Arrays.asList(p1, p2));
        vendedorRepository.saveAll(Arrays.asList(v1, v2, v3));

    }

}
