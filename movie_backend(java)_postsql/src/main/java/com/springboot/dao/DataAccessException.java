package com.springboot.dao;

public class DataAccessException extends Exception {


	public static DataAccessException init(Exception e) {
		DataAccessException dae = new DataAccessException();
		dae.initCause(e);
		return dae;
	}

}
