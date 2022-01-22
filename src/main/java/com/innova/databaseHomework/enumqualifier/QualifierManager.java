package com.innova.databaseHomework.enumqualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "multipleQualifier")
@ApplicationScoped
public class QualifierManager {

	@Inject
	@EQualifier(EDatabaseVerison.MsSQL)
	IDatabaseVersion iDatabaseVersion;
	
	public String getiDatabaseVersion() {
		return iDatabaseVersion.databaseVersion("Selection");
	}
	
}
