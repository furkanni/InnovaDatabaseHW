package com.innova.databaseHomework.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "AlternativeCDI")
@ApplicationScoped
public class DatabaseManager {
	
	@Inject
	private IDatabaseVersion iDatabaseVersion;
	
	public String getiDatabaseVersion() {

		return iDatabaseVersion.databaseVersion("Selected: ");
	}
	
}
