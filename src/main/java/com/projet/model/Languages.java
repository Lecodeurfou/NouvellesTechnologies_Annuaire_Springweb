package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name="languages")
public class Languages {
	@Id
	@Column(name="LANGUAGE_ID", nullable=false)
	private double idLanguage;
	
    @Column(name="LANGUAGE_CODE", nullable=false)
    private String idCode;

    @Column(name="LANGUAGE_NAME", nullable=false)
    private String idName;

	public double getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(int idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getIdCode() {
		return idCode;
	}

	public void setIdCode(String idCode) {
		this.idCode = idCode;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}
    



}
    