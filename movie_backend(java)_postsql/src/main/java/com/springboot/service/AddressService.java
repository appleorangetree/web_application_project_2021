package com.springboot.service;

import java.util.List;

import com.springboot.bean.Address;
import com.springboot.dao.DataAccessException;

public interface AddressService {
	
	public List<Address> search(Address address) throws DataAccessException;

	public void update(Address addressy) throws DataAccessException;

	public void delete(Address address) throws DataAccessException;

	public void create(Address address) throws DataAccessException;

}
