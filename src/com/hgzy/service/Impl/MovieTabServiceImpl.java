package com.hgzy.service.Impl;

import java.util.List;

import com.hgzy.dao.Impl.MovieTabDAOImpl;
import com.hgzy.entity.MovieTab;
import com.hgzy.service.MovieTabService;

public class MovieTabServiceImpl implements MovieTabService{
	private MovieTabDAOImpl movieDao;

	public void setMovieDao(MovieTabDAOImpl movieDao) {
		this.movieDao = movieDao;
	}
	public List<MovieTab> findAllMovie(){
		return movieDao.findAll();
	}
}
