package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Pronostic
 *
 */
@Entity

public class Pronostic implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idpro;
	private String results;
	private static final long serialVersionUID = 1L;

	public Pronostic() {
		super();
	}   
	public Integer getId() {
		return this.idpro;
	}

	public void setId(Integer id) {
		this.idpro = id;
	}   
	public String getResults() {
		return this.results;
	}

	public void setResults(String results) {
		this.results = results;
	}
   
}
