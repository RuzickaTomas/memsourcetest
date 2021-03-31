package com.example.memsourcetest.rest;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Project implements Serializable {
	
	private String uid;
	private String internalId;
	private String id;
	private String name;
	private Date dateCreated;
	private Domain domain;
	private Domain subDomain;
	private User owner;
	private String sourceLang;
	private Collection<String> targetLangs;
	private Collection<Reference> references;
	private Collection<SettingsPerLanguage> mtSettingsPerLanguageList;
	private String userRole;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Domain getDomain() {
		return domain;
	}
	public void setDomain(Domain domain) {
		this.domain = domain;
	}
	public Domain getSubDomain() {
		return subDomain;
	}
	public void setSubDomain(Domain subDomain) {
		this.subDomain = subDomain;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public String getSourceLang() {
		return sourceLang;
	}
	public void setSourceLang(String sourceLang) {
		this.sourceLang = sourceLang;
	}
	public Collection<String> getTargetLangs() {
		return targetLangs;
	}
	public void setTargetLangs(Collection<String> targetLangs) {
		this.targetLangs = targetLangs;
	}
	public Collection<Reference> getReferences() {
		return references;
	}
	public void setReferences(Collection<Reference> references) {
		this.references = references;
	}
	public Collection<SettingsPerLanguage> getMtSettingsPerLanguageList() {
		return mtSettingsPerLanguageList;
	}
	public void setMtSettingsPerLanguageList(Collection<SettingsPerLanguage> mtSettingsPerLanguageList) {
		this.mtSettingsPerLanguageList = mtSettingsPerLanguageList;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dateCreated, domain, id, internalId, mtSettingsPerLanguageList, name, owner, references,
				sourceLang, subDomain, targetLangs, uid, userRole);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(dateCreated, other.dateCreated) && Objects.equals(domain, other.domain)
				&& Objects.equals(id, other.id) && Objects.equals(internalId, other.internalId)
				&& Objects.equals(mtSettingsPerLanguageList, other.mtSettingsPerLanguageList)
				&& Objects.equals(name, other.name) && Objects.equals(owner, other.owner)
				&& Objects.equals(references, other.references) && Objects.equals(sourceLang, other.sourceLang)
				&& Objects.equals(subDomain, other.subDomain) && Objects.equals(targetLangs, other.targetLangs)
				&& Objects.equals(uid, other.uid) && Objects.equals(userRole, other.userRole);
	}
	@Override
	public String toString() {
		return "Project [uid=" + uid + ", internalId=" + internalId + ", id=" + id + ", name=" + name + ", dateCreated="
				+ dateCreated + ", domain=" + domain + ", subDomain=" + subDomain + ", owner=" + owner + ", sourceLang="
				+ sourceLang + ", targetLangs=" + targetLangs + ", references=" + references
				+ ", mtSettingsPerLanguageList=" + mtSettingsPerLanguageList + ", userRole=" + userRole + "]";
	}
	
	
	
	
	
	
}
