package com.springboot.service;

import java.util.List;
import com.springboot.bean.Role;
import com.springboot.dao.DataAccessException;

public interface RoleService {
	
	public List<Role> search(Role role) throws DataAccessException;

	public void update(Role role) throws DataAccessException;

	public void delete(Role role) throws DataAccessException;

	public void create(Role role) throws DataAccessException;

}
