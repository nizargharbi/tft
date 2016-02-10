package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Stadium
 *
 */
@Entity
@Table(name="t_stadium")
public class Stadium implements Serializable {

	
	private Integer idStadium;
	private String nameStadium;
//	@OneToMany(mappedBy="stadium")
//	private Collection<Game> games;
	
	private static final long serialVersionUID = 1L;

	public Stadium() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdStadium() {
		return this.idStadium;
	}

	public void setIdStadium(Integer id_stadium) {
		this.idStadium = id_stadium;
	}   
	public String getNameStadium() {
		return this.nameStadium;
	}

	public void setNameStadium(String name_stadium) {
		this.nameStadium = name_stadium;
	}
   
}
