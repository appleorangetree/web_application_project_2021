package com.springboot.service;

import java.util.List;

import com.springboot.bean.SeenMovie;
import com.springboot.dao.DataAccessException;

public interface SeenMovieService {
	
	
	public List<SeenMovie> search(SeenMovie seenmovie) throws DataAccessException;

	public void update(SeenMovie seenmovie) throws DataAccessException;

	public void delete(SeenMovie seenmovie) throws DataAccessException;

	public void create(SeenMovie seenmovie) throws DataAccessException;

}
