package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;

import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competition
 *
 */
@Entity

public class Competition implements Serializable {

	  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idcompetition;
	@OneToMany(mappedBy="competition")
	private Collection<Game> games;

	public Collection<Game> getGames() {
		return games;
	}
	public void setGames(Collection<Game> games) {
		this.games = games;
	}

	private static final long serialVersionUID = 1L;

	public Competition() {
		super();
	}   
	public Integer getIdcompetition() {
		return this.idcompetition;
	}

	public void setIdcompetition(Integer idcompetition) {
		this.idcompetition = idcompetition;
	}   
   
}
