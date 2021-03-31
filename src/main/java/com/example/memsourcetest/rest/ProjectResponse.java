package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class ProjectResponse implements Serializable {
	
	/*
	 * "totalElements": 0,
"totalPages": 0,
"pageSize": 0,
"pageNumber": 0,
"numberOfElements": 0,
"content": 
[]
	 */

	private Integer totalElements;
	private Integer totalPages;
	private Integer pageSize;
	private Integer pageNumber;
	private Integer numberOfElements;
	private Collection<Project> content;
	public Integer getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(Integer totalElements) {
		this.totalElements = totalElements;
	}
	public Integer getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(Integer totalPages) {
		this.totalPages = totalPages;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public Integer getPageNumber() {
		return pageNumber;
	}
	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}
	public Integer getNumberOfElements() {
		return numberOfElements;
	}
	public void setNumberOfElements(Integer numberOfElements) {
		this.numberOfElements = numberOfElements;
	}
	public Collection<Project> getContent() {
		return content;
	}
	public void setContent(Collection<Project> content) {
		this.content = content;
	}
	@Override
	public int hashCode() {
		return Objects.hash(content, numberOfElements, pageNumber, pageSize, totalElements, totalPages);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProjectResponse other = (ProjectResponse) obj;
		return Objects.equals(content, other.content) && Objects.equals(numberOfElements, other.numberOfElements)
				&& Objects.equals(pageNumber, other.pageNumber) && Objects.equals(pageSize, other.pageSize)
				&& Objects.equals(totalElements, other.totalElements) && Objects.equals(totalPages, other.totalPages);
	}
	
	
}
