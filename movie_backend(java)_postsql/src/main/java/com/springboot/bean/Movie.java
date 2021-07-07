package com.springboot.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer movie_id;
	
	@Column(name="_title")
	private String  title;
	
	@Column(name="_author")
	private String  author;
	
	@Column(name="_added")
	private Date added;
	
	@Column(name="_external_id")
	private String  external_id;
	
	
	
	public Movie() {
	}
	public Movie(Integer movie_id, String title, String author, Date added, String external_id) {
		this.movie_id = movie_id;
		this.title = title;
		this.author = author;
		this.added = added;
		this.external_id = external_id;
	}
	public Integer getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getAdded() {
		return added;
	}
	public void setAdded(Date added) {
		this.added = added;
	}
	public String getExternal_id() {
		return external_id;
	}
	public void setExternal_id(String external_id) {
		this.external_id = external_id;
	}
	@Override
	public String toString() {
		return "Movie [movie_id=" + movie_id + ", title=" + title + ", author=" + author + ", added=" + added
				+ ", external_id=" + external_id + "]";
	}

	

	
	
}
