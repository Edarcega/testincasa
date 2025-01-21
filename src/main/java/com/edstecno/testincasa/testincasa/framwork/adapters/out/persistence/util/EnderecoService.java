package com.edstecno.testincasa.testincasa.framwork.adapters.out.persistence.util;

import com.edstecno.testincasa.testincasa.domain.entities.Endereco;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;

@Service
public class EnderecoService {

    @Value("${urlCep}")
    private String urlCep;

    public Endereco findByCep(String cep) {
        RestTemplate restTemplate = new RestTemplate();
        Endereco endereco = restTemplate.getForObject(MessageFormat.format(urlCep, cep), Endereco.class);
        return endereco;
    }


}
