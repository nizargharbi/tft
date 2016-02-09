package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autentificates
 *
 */
@Entity
@DiscriminatorValue(value="authentificates")
public class Autentificates extends User implements Serializable {

	
	private Integer cinauthen;
	private static final long serialVersionUID = 1L;

	public Autentificates() {
		super();
	}   
	public Integer getCin() {
		return this.cinauthen;
	}

	public void setCin(Integer cin) {
		this.cinauthen = cin;
	}
   
}
