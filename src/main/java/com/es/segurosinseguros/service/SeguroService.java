package com.es.segurosinseguros.service;

import com.es.segurosinseguros.dto.SeguroDTO;
import com.es.segurosinseguros.exception.BadRequestException;
import com.es.segurosinseguros.repository.SeguroRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class SeguroService {

    @Autowired
    private SeguroRepository seguroRepository;

    public SeguroDTO getById(String id){
        // Asegurar ID Long
        Long idL = 0L;
        try{
            idL = Long.parseLong(id);
        } catch (NumberFormatException e){
            throw new BadRequestException("El formato del id: "+id+" es incorrecto");
        }
        //

        // Validar DNI

    }
}
