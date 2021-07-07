package com.springboot.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="_conntact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer contact_id;
	
	@Column(name = "_name")
	private String name;
	
	@Column(name = "_birthdate")
	private Date birthDate;
	
	@Column(name = "_gender")
	private String gender;
	
	@Column(name = "_email")
	private String email;
	
	@Column(name = "_address_id_1")
	private Integer address_id_1;
	
	@Column(name = "_address_id_2")
	private Integer address_id_2;
	
	
	
	public Contact() {
	}
	public Contact(Integer contact_id, String name, Date birthDate, String gender, String email, Integer address_id_1,
			Integer address_id_2) {
		
		this.contact_id = contact_id;
		this.name = name;
		this.birthDate = birthDate;
		this.gender = gender;
		this.email = email;
		this.address_id_1 = address_id_1;
		this.address_id_2 = address_id_2;
	}
	public Integer getAddress_id_1() {
		return address_id_1;
	}
	public void setAddress_id_1(Integer address_id_1) {
		this.address_id_1 = address_id_1;
	}
	public Integer getAddress_id_2() {
		return address_id_2;
	}
	public void setAddress_id_2(Integer address_id_2) {
		this.address_id_2 = address_id_2;
	}
	public Integer getContact_id() {
		return contact_id;
	}
	public void setContact_id(Integer contact_id) {
		this.contact_id = contact_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Contact [contact_id=" + contact_id + ", name=" + name + ", birthDate=" + birthDate + ", gender="
				+ gender + ", email=" + email + ", address_id_1=" + address_id_1 + ", address_id_2=" + address_id_2
				+ "]";
	}
	
	
}
