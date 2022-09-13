package com.bbva.cpqr.lib.r051.impl;

import com.bbva.cpqr.lib.r051.CPQRR051;
import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;

/**
 * This class automatically defines the libraries and utilities that it will use.
 */
public abstract class CPQRR051Abstract extends AbstractLibrary implements CPQRR051 {

	protected ApplicationConfigurationService applicationConfigurationService;


	/**
	* @param applicationConfigurationService the this.applicationConfigurationService to set
	*/
	public void setApplicationConfigurationService(ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}

}