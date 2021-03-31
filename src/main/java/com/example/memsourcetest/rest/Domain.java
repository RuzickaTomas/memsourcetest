package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.Objects;

public class Domain implements Serializable {
	private String uid;
	private String name;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, uid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Domain other = (Domain) obj;
		return Objects.equals(name, other.name) && Objects.equals(uid, other.uid);
	}
	
	
}
