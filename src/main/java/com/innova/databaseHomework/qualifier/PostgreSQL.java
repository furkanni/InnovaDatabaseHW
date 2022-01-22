package com.innova.databaseHomework.qualifier;

@QualifierCokluSecim
public class PostgreSQL implements IDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		return "Optional Database: PostgreSQL";
	}
	
}
