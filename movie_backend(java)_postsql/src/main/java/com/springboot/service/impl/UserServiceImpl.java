package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.bean.User;
import com.springboot.dao.DataAccessException;
import com.springboot.dao.IUserDAO;
import com.springboot.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private IUserDAO userDAO;

	@Override
	public List<User> search(User user) throws DataAccessException {
		return userDAO.search(user);
	}
	@Override
	public void update(User user) throws DataAccessException {
		userDAO.update(user);
	}
	@Override
	public void delete(User user) throws DataAccessException {
		userDAO.delete(user);
	}
	@Override
	public void create(User user) throws DataAccessException {
		userDAO.create(user);
	}
}