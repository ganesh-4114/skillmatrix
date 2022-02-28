package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="register")
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long eid;
	private String name;
	private String email;
	private String uname;
	private String pass;
	private String role;



	public long getEid() {
		return eid;

	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "Register [eid=" + eid + ", name=" + name + ", email=" + email + ", uname=" + uname + ", pass="
				+ pass + ", role=" + role + "]";
	}


}
