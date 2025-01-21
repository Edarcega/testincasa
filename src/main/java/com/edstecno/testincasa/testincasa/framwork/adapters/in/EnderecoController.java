package com.edstecno.testincasa.testincasa.framwork.adapters.in;

import com.edstecno.testincasa.testincasa.domain.entities.Endereco;
import com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.util.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @GetMapping("/{cep}")
    public Endereco getEnderecoPorCep(@PathVariable String cep) {
        return new ResponseEntity<Endereco>(enderecoService.findByCep(cep), HttpStatus.ACCEPTED).getBody();
    }
}
