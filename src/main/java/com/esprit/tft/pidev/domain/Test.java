package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Test
 *
 */
@Entity

public class Test implements Serializable {

	   
	
	private Integer idtest;
	private String refernce;
	private String description;
	private static final long serialVersionUID = 1L;

	public Test() {
		super();
	} 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdtest() {
		return this.idtest;
	}

	public void setIdtest(Integer idtest) {
		this.idtest = idtest;
	}   
	public String getRefernce() {
		return this.refernce;
	}

	public void setRefernce(String refernce) {
		this.refernce = refernce;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
   
}
