package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.bean.SeenMovie;
import com.springboot.dao.DataAccessException;
import com.springboot.dao.ISeenMovieDAO;
import com.springboot.service.SeenMovieService;

@Service
public class SeenMovieServiceImpl implements SeenMovieService {

	@Autowired
	private ISeenMovieDAO seenmovieDAO;

	@Override
	public List<SeenMovie> search(SeenMovie seenmovie) throws DataAccessException {
		return seenmovieDAO.search(seenmovie);
	}
	@Override
	public void update(SeenMovie seenmovie) throws DataAccessException {
		seenmovieDAO.update(seenmovie);
	}
	@Override
	public void delete(SeenMovie seenmovie) throws DataAccessException {
		seenmovieDAO.delete(seenmovie);
	}
	@Override
	public void create(SeenMovie seenmovie) throws DataAccessException {
		seenmovieDAO.create(seenmovie);
	}
}