package com.springboot.service;

import java.util.List;

import com.springboot.bean.Contact;
import com.springboot.dao.DataAccessException;

public interface ContactService {
	
	public List<Contact> search(Contact contact) throws DataAccessException;

	public void update(Contact contact) throws DataAccessException;

	public void delete(Contact contact) throws DataAccessException;

	public void create(Contact contact) throws DataAccessException;

}
