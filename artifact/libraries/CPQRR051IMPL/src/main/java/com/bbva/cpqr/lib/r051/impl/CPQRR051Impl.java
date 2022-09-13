package com.bbva.cpqr.lib.r051.impl;

import com.bbva.cpqr.dto.datos.ResponsePersona;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * The CPQRR051Impl class...
 */
public class CPQRR051Impl extends CPQRR051Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(CPQRR051Impl.class);
	private static final String SEPARATOR_FILE = ",";
	private String inPath;

	/**
	 * The execute method...
	 */
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
