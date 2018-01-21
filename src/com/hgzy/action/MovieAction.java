package com.hgzy.action;

import com.hgzy.service.MovieTabService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
/**
 * 电影表的CRUD操作
 * @author 李恒
 *
 */
public class MovieAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private MovieTabService movieService;
	public void setMovieService(MovieTabService movieService) {
		this.movieService = movieService;
	}
	
	public String list(){
		ActionContext.getContext().put("movies", movieService.findAllMovie());
		return "listsuccess";
	}
}
