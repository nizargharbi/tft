package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="refree")
public class Refree extends User implements Serializable {

	
	private String experience;
	private String competence;
	private String type;
	private String grade;
	@OneToMany(mappedBy="refree")
	private Collection<Game> games;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public Collection<Game> getGames() {
		return games;
	}
	public void setGames(Collection<Game> games) {
		this.games = games;
	}

	private static final long serialVersionUID = 1L;

	public Refree() {
		super();
	}   
	public String getExperience() {
		return this.experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}   
	public String getCompetence() {
		return this.competence;
	}

	public void setCompetence(String competence) {
		this.competence = competence;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public String getGarde() {
		return this.grade;
	}

	public void setGarde(String garde) {
		this.grade = garde;
	}
   
}
