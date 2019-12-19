package com.projet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="city")
public class City 
{
    @Id
    @Column(name="ID", nullable=false)
    private int id	;
    
    @Column(name="ID_CITY", nullable=false)
    private int idCity;
    
    @Column(name="ID_AREA", nullable=false)
    private String idArea;

    @Column(name="REFCODE", nullable=false)
    private String idRefcode;
    
    @Column(name="CITY_NAME", nullable=false)
    private String idCityName;
    
    @Column(name="ZIP_LABEL", nullable=false)
    private String idZiplabel;
    
    @Column(name="ID_ZIP", nullable=false)
    private String idZip;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdCity() {
		return idCity;
	}

	public void setIdCity(int idCity) {
		this.idCity = idCity;
	}

	public String getIdArea() {
		return idArea;
	}

	public void setIdArea(String idArea) {
		this.idArea = idArea;
	}

	public String getIdRefcode() {
		return idRefcode;
	}

	public void setIdRefcode(String idRefcode) {
		this.idRefcode = idRefcode;
	}

	public String getIdCityName() {
		return idCityName;
	}

	public void setIdCityName(String idCityName) {
		this.idCityName = idCityName;
	}

	public String getIdZiplabel() {
		return idZiplabel;
	}

	public void setIdZiplabel(String idZiplabel) {
		this.idZiplabel = idZiplabel;
	}

	public String getIdZip() {
		return idZip;
	}

	public void setIdZip(String idZip) {
		this.idZip = idZip;
	}



}