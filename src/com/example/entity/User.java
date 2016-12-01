package com.example.entity;

import java.io.Serializable;

public class User implements Serializable{
	String userNameString;
	String userMinaString;
	public String getUserNameString() {
		return userNameString;
	}
	public void setUserNameString(String userNameString) {
		this.userNameString = userNameString;
	}
	public String getUserMinaString() {
		return userMinaString;
	}
	public void setUserMinaString(String userMinaString) {
		this.userMinaString = userMinaString;
	}
	public User(String userNameString, String userMinaString) {
		super();
		this.userNameString = userNameString;
		this.userMinaString = userMinaString;
	}
	public User() {
		super();
	}
	
}
