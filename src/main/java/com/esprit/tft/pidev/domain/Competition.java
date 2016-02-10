package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;

import java.util.Collection;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competition
 *
 */
@Entity

public class Competition implements Serializable {

	  
		private Integer idcompetition;
	
	private List<Game> games;
	
	
	@OneToMany(mappedBy="competition")
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}

	private static final long serialVersionUID = 1L;

	public Competition() {
		super();
	} 
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Integer getIdcompetition() {
		return this.idcompetition;
	}

	public void setIdcompetition(Integer idcompetition) {
		this.idcompetition = idcompetition;
	}   
   
}
