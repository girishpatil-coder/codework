package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Table(name="customer")
public class CustTable{
	
	@Id
	private int id;
	@Column(name="Name")
	private String name;
	private String uname;
	private String pass;
	private String address;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustTable [id=" + id + ", name=" + name + ", uname=" + uname + ", pass=" + pass + ", address=" + address
				+ "]";
	}
	
	
	
	
}
