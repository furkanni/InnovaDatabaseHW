package com.innova.databaseHomework.enumqualifier;

import javax.enterprise.inject.Default;

@Default
public class DefaultDatabaseVersion implements IDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {
		return "Default Database: MySQL";
	}
	
}
