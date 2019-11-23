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
    private String ipZip;

}