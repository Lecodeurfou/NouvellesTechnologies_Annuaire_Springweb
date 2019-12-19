package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="street")
public class Street {

	@Id
	@Column(name="ID",nullable=false)
	private int id;
	
	@Column(name="ID_STREET_NAME", nullable=false)
	private String idStreetName;
	
	@Column(name= "ID_CITY",nullable = false)
	private String idCity;
	
	@Column(name="STREET_NAME_LABEL", nullable=false)
	private String idStreetNameLabel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdStreetName() {
		return idStreetName;
	}

	public void setIdStreetName(String idStreetName) {
		this.idStreetName = idStreetName;
	}

	public String getIdCity() {
		return idCity;
	}

	public void setIdCity(String idCity) {
		this.idCity = idCity;
	}

	public String getIdStreetNameLabel() {
		return idStreetNameLabel;
	}

	public void setIdStreetNameLabel(String idStreetNameLabel) {
		this.idStreetNameLabel = idStreetNameLabel;
	}


	
	
}
