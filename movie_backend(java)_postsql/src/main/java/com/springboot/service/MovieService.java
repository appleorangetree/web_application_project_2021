package com.springboot.service;

import java.util.List;

import com.springboot.bean.Movie;
import com.springboot.dao.DataAccessException;

public interface MovieService {
	
	public List<Movie> search(Movie movie) throws DataAccessException;

	public void update(Movie movie) throws DataAccessException;

	public void delete(Movie movie) throws DataAccessException;

	public void create(Movie movie) throws DataAccessException;

}
