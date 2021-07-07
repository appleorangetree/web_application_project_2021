package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.bean.Address;
import com.springboot.dao.DataAccessException;
import com.springboot.dao.IAddressDAO;
import com.springboot.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private IAddressDAO addressDAO;

	@Override
	public List<Address> search(Address address) throws DataAccessException {
		return addressDAO.search(address);
	}
	@Override
	public void update(Address address) throws DataAccessException {
		addressDAO.update(address);
	}
	@Override
	public void delete(Address address) throws DataAccessException {
		addressDAO.delete(address);
	}
	@Override
	public void create(Address address) throws DataAccessException {
		addressDAO.create(address);
	}
}