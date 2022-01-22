package com.innova.databaseHomework.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class PostgreSQL implements IDatabaseVersion {


	@Override
	public String databaseVersion(String data) {
		return "PostgreSQL Database";
	}
}
