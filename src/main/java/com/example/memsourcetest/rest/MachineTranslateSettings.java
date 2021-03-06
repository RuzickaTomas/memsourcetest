package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.Objects;

public class MachineTranslateSettings implements Serializable {
	private String id;
	private String uid;
	private String name;
	private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, type, uid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MachineTranslateSettings other = (MachineTranslateSettings) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(type, other.type)
				&& Objects.equals(uid, other.uid);
	}
	
	
}
