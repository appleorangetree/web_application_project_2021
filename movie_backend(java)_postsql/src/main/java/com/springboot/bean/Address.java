package com.springboot.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="_address")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Integer address_id;
	
	@Column(name = "_country")
	private String country;
	
	@Column(name = "_area")
	private String area;
	
	@Column(name = "_city")
	private String city;
	
	@Column(name = "_street")
	private String street;
	
	@Column(name = "_number")
	private String number;
	
	
	
	public Address() {
	}
	public Address(Integer address_id, String country, String area, String city, String street, String number) {
		this.address_id = address_id;
		this.country = country;
		this.area = area;
		this.city = city;
		this.street = street;
		this.number = number;
	}
	public Integer getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", country=" + country + ", area=" + area + ", city=" + city
				+ ", street=" + street + ", number=" + number + "]";
	}
	
	
	
}
