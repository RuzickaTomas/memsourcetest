package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class UserResponse implements Serializable {

	private User user;
	private String token;
	private Date expires;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Date getExpires() {
		return expires;
	}
	public void setExpires(Date expires) {
		this.expires = expires;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(expires, token, user);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserResponse other = (UserResponse) obj;
		return Objects.equals(expires, other.expires) && Objects.equals(token, other.token)
				&& Objects.equals(user, other.user);
	}
	
	
	
	
}
