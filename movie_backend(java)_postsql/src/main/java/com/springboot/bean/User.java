package com.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer user_id;
	
	@Column(name="_username")
	private String username;
	
	@Column(name="_password")
	private String password;
	
	@Column(name="_contact_id")
	private Integer contact_id;
	
	@Column(name="_role_id")
	private Integer role_id;
	
	
	
	public User() {
	}

	public User(Integer user_id, String username, String password, Integer contact_id, Integer role_id) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.contact_id = contact_id;
		this.role_id = role_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRole_id() {
		return role_id;
	}

	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}

	public Integer getContact_id() {
		return contact_id;
	}

	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", contact_id="
				+ contact_id + ", role_id=" + role_id + "]";
	}
	

}
