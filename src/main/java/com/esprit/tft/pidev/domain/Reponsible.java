package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Responsible
 *
 */
@Entity
@DiscriminatorValue(value="responsible")
public class Reponsible extends User implements Serializable {

	
	private String university;
	private static final long serialVersionUID = 1L;

	public Reponsible() {
		super();
	}   
	public String getUniersity() {
		return this.university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
   
}
