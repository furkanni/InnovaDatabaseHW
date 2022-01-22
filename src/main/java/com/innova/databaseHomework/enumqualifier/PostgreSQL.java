package com.innova.databaseHomework.enumqualifier;

@EQualifier(EDatabaseVerison.MySQL)
public class PostgreSQL implements IDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		
		return "Optional Database: PostgreSQL";
	}
	
}
