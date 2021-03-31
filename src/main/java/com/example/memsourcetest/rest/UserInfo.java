package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.lang.NonNull;

public class UserInfo implements Serializable {
	
	@NonNull
	private String userName;
	@NonNull
	private String password;
	private String code;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, password, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserInfo other = (UserInfo) obj;
		return Objects.equals(code, other.code) && Objects.equals(password, other.password)
				&& Objects.equals(userName, other.userName);
	}
	
	
	

	
	
	

	
	
	
	

}
