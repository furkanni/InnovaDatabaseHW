package com.innova.databaseHomework.enumqualifier;

@EQualifier(EDatabaseVerison.PostgreSQL)
public class MsSQL implements IDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		
		return "Optional Database: MsSQL";
	}
	
}
