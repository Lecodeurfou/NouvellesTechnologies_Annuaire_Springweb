package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="area")
public class Area {
	@Id
	@Column(name="ID_AREA", nullable=false)
	private int idArea;
	
    @Column(name="ID_COUNTRY", nullable=false)
    private String idCountry;

    @Column(name="LANGUAGE_ID", nullable=false)
    private String idLanguage;
    
    @Column(name="AREA_LABEL", nullable=false)
    private String idLabel;

	public int getIdArea() {
		return idArea;
	}

	public void setIdArea(int idArea) {
		this.idArea = idArea;
	}

	public String getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}

	public String getIdLanguage() {
		return idLanguage;
	}

	public void setIdLanguage(String idLanguage) {
		this.idLanguage = idLanguage;
	}

	public String getIdLabel() {
		return idLabel;
	}

	public void setIdLabel(String idLabel) {
		this.idLabel = idLabel;
	}
    
}
