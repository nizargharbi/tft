package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Adminstrator
 *
 */
@Entity
@DiscriminatorValue(value="administrator")
public class Adminstrator extends User implements Serializable {

	
	private Integer cinadmin;
	private static final long serialVersionUID = 1L;

	public Adminstrator() {
		super();
	}   
	public Integer getCin() {
		return this.cinadmin;
	}

	public void setCin(Integer cin) {
		this.cinadmin = cin;
	}
   
}
