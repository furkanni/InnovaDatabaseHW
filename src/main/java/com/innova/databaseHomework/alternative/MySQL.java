package com.innova.databaseHomework.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class MySQL implements IDatabaseVersion {

	@Override
	public String databaseVersion(String data) {
		return "MySQL Database";
	}
}
