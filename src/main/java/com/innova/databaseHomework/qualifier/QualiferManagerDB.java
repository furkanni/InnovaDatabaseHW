package com.innova.databaseHomework.qualifier;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named("qualiferCDI")
@ApplicationScoped
public class QualiferManagerDB implements Serializable {
	private static final long serialVersionUID = 254452543L;

	@Inject
	@QualifierCokluSecim
	private IDatabaseVersion iDatabaseVersion;
	
	public String getiDatabaseVersion() {

		return iDatabaseVersion.databaseVersion("Selected Database: ");

	}
	
}
