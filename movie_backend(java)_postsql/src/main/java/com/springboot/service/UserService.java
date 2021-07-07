package com.springboot.service;

import java.util.List;

import com.springboot.bean.User;
import com.springboot.dao.DataAccessException;

public interface UserService {
	
	public List<User> search(User user) throws DataAccessException;

	public void update(User user) throws DataAccessException;

	public void delete(User user) throws DataAccessException;

	public void create(User user) throws DataAccessException;

}
