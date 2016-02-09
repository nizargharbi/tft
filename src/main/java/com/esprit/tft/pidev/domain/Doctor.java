package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity
@DiscriminatorValue(value="doctor")
public class Doctor extends User implements Serializable {

	
	private String speciality;
	private static final long serialVersionUID = 1L;

	public Doctor() {
		super();
	}   
	public String getSpeciality() {
		return this.speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
   
}
