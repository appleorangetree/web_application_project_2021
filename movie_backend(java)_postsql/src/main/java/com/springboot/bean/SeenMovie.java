package com.springboot.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="_seenmovie")
public class SeenMovie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer Seen_movie_id;
	
	@Column(name="_date")
	private Date date;
	
	@Column(name="_movie_id")
	private Integer movie_id;
	
	@Column(name="_user_id")
	private Integer user_id;
	
	
	
	
	public SeenMovie() {
	}
	public SeenMovie(Integer seen_movie_id, Date date, Integer movie_id, Integer user_id) {
		Seen_movie_id = seen_movie_id;
		this.date = date;
		this.movie_id = movie_id;
		this.user_id = user_id;
	}
	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getSeen_movie_id() {
		return Seen_movie_id;
	}
	public void setSeen_movie_id(Integer seen_movie_id) {
		Seen_movie_id = seen_movie_id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "SeenMovie [Seen_movie_id=" + Seen_movie_id + ", date=" + date + ", movie_id=" + movie_id + ", user_id="
				+ user_id + "]";
	}
	

}
