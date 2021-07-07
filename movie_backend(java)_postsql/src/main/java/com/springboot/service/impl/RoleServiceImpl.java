package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.bean.Role;
import com.springboot.dao.DataAccessException;
import com.springboot.dao.IRoleDAO;
import com.springboot.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private IRoleDAO roleDAO;

	@Override
	public List<Role> search(Role role) throws DataAccessException {
		return roleDAO.search(role);
	}
	@Override
	public void update(Role role) throws DataAccessException {
		roleDAO.update(role);
	}
	@Override
	public void delete(Role role) throws DataAccessException {
		roleDAO.delete(role);
	}
	@Override
	public void create(Role role) throws DataAccessException {
		roleDAO.create(role);
	}
}