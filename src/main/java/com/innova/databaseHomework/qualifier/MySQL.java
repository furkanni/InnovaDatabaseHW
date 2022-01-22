package com.innova.databaseHomework.qualifier;

import javax.enterprise.inject.Default;

// Defautta bu obje gelsin.
@Default
public class MySQL implements IDatabaseVersion {
	
	@Override
	public String databaseVersion(String data) {

		return "Default Database: MySQL";
	}
	
}
