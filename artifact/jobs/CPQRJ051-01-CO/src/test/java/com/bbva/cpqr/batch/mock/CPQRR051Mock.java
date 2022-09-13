package com.bbva.cpqr.batch.mock;

import com.bbva.cpqr.dto.datos.ResponsePersona;
import com.bbva.cpqr.lib.r051.CPQRR051;

import java.util.Date;

public class CPQRR051Mock implements CPQRR051 {
    @Override
    public ResponsePersona execute() {

        ResponsePersona responsePersona = new ResponsePersona();
        responsePersona.setName("Cristian");
        responsePersona.setSurname("Sanchez");
        responsePersona.setCedula("123748536");
        responsePersona.setEdad(25);
        responsePersona.setTelefono("3212554562");
        responsePersona.setFechaNacimiento(new Date("13/04/1998"));

        return null;
    }
}
