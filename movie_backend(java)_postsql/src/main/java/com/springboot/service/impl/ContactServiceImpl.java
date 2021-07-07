package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.bean.Contact;
import com.springboot.dao.DataAccessException;
import com.springboot.dao.IContactDAO;
import com.springboot.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private IContactDAO contactDAO;

	@Override
	public List<Contact> search(Contact contact) throws DataAccessException {
		return contactDAO.search(contact);
	}
	@Override
	public void update(Contact contact) throws DataAccessException {
		contactDAO.update(contact);
	}
	@Override
	public void delete(Contact contact) throws DataAccessException {
		contactDAO.delete(contact);
	}
	@Override
	public void create(Contact contact) throws DataAccessException {
		contactDAO.create(contact);
	}
}