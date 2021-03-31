package com.example.memsourcetest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memuser", schema = "public")
public class MemUser implements Serializable {

	@Id
	@Column
	private Long id;
	
	@Column
	private String username;
	
	@Column  
	private String token;
	
	@Column
	private Date expires;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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
		return Objects.hash(expires, id, token, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemUser other = (MemUser) obj;
		return Objects.equals(expires, other.expires) && Objects.equals(id, other.id)
				&& Objects.equals(token, other.token) && Objects.equals(username, other.username);
	}
	
	
	
}
