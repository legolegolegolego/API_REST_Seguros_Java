package com.es.segurosinseguros.controller;

import com.es.segurosinseguros.dto.SeguroDTO;
import com.es.segurosinseguros.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/seguros")
public class SeguroController {

    // Autowired

    @GetMapping("/{id}")
    public ResponseEntity<SeguroDTO> getById(@PathVariable String id){

        // 1º Compruebo que el id no es null
        if (id == null || id.equals("a")){
            /*
                LANZO UNA EXCEPCION PROPIA
             a) Qué código de estado devolveriais -> BAD_REQUEST (400)
             b) Qué información daríais al cliente
             -> Un mensaje: "id no puede ser null"
             -> La URI: localhost:8080/seguros/x"
             c) Nombre a nuestra excepción -> BadRequestException
             */
            throw new BadRequestException("id no válido");
        }
        return null;
    }
}
