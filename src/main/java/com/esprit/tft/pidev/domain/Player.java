package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
@DiscriminatorValue(value="player")
public class Player extends User implements Serializable {

	
	private Integer age;
	private String categorie;
	@ManyToOne
	@JoinColumn(name="id_club")
	private Club club;
	@ManyToMany(mappedBy="players")
	private Collection<Game> games;
	
	public Collection<Game> getGames() {
		return games;
	}
	public void setGames(Collection<Game> games) {
		this.games = games;
	}
	public Club getClub() {
		return club;
	}
	public void setClub(Club club) {
		this.club = club;
	}

	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}   
	public String getCategorie() {
		return this.categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
   
}
