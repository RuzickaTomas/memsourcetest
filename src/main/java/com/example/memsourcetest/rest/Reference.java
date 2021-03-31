package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.Objects;

public class Reference implements Serializable {
	
	private String id;
	private String note;
	private String filename;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	@Override
	public int hashCode() {
		return Objects.hash(filename, id, note);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reference other = (Reference) obj;
		return Objects.equals(filename, other.filename) && Objects.equals(id, other.id)
				&& Objects.equals(note, other.note);
	}
	
	
	
	

}
