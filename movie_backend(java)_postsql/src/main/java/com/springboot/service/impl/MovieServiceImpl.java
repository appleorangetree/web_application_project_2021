package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.bean.Movie;
import com.springboot.dao.DataAccessException;
import com.springboot.dao.IMovieDAO;
import com.springboot.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private IMovieDAO movieDAO;

	@Override
	public List<Movie> search(Movie movie) throws DataAccessException {
		return movieDAO.search(movie);
	}
	@Override
	public void update(Movie movie) throws DataAccessException {
		movieDAO.update(movie);
	}
	@Override
	public void delete(Movie movie) throws DataAccessException {
		movieDAO.delete(movie);
	}
	@Override
	public void create(Movie movie) throws DataAccessException {
		movieDAO.create(movie);
	}
}