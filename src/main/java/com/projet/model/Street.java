package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="street")
public class Street 
{
    @Id
    @Column(name="ID", nullable=false)
    private int id;
    
    @Column(name="ID_STREET_NAME", nullable=false)
    private String idName;
    
    @Column(name="ID_CITY", nullable=false)
    private String idCity;
    
    @Column(name="STREET_NAME_LABEL", nullable=false)
    private String idStreetName;

	
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdName() {
		return idName;
	}

	public void setIdName(String idName) {
		this.idName = idName;
	}

	public String getIdCity() {
		return idCity;
	}

	public void setIdCity(String idCity) {
		this.idCity = idCity;
	}

	public String getIdStreetName() {
		return idStreetName;
	}

	public void setIdStreetName(String idStreetName) {
		this.idStreetName = idStreetName;
	}
	
}

