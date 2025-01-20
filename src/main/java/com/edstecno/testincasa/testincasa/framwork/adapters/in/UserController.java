package com.edstecno.testincasa.testincasa.framwork.adapters.in;

import com.edstecno.testincasa.testincasa.application.ports.in.UserPortIn;
import com.edstecno.testincasa.testincasa.application.ports.out.UserRepository;
import com.edstecno.testincasa.testincasa.domain.DTOS.VendedorDTO;
import com.edstecno.testincasa.testincasa.domain.entities.User;
import com.edstecno.testincasa.testincasa.domain.entities.Vendedor;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    UserPortIn userPortIn;

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "")
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userPortIn.findAll();
        return ResponseEntity.ok().body(users);
    }

    @GetMapping(value = "/vendedor")
    public ResponseEntity<List<VendedorDTO>> buscaVendedores() {
        List<Vendedor> vendedores = userPortIn.buscaVendedores();
        List<VendedorDTO> dtoList = vendedores.stream().map(x -> new VendedorDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(dtoList);
    }

    @GetMapping(value = "/vendedor/{id}")
    public ResponseEntity<VendedorDTO> buscaVendedor(@PathVariable String id) {
        return ResponseEntity.ok().body(new VendedorDTO(userPortIn.buscaVendedor(id)));
    }

}
