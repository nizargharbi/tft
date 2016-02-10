package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;


@Entity
@DiscriminatorValue(value="refree")
public class Refree extends User implements Serializable {

	
	private String experience;
	private String competence;
	private String type;
	private String grade;
	
	private List<Game> games;
	
	
	private List<Session> sessions;
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@OneToMany(mappedBy="refree")
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
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
	@ManyToMany(mappedBy="refrees")
	public List<Session> getSessions() {
		return sessions;
	}
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}
	
   
}
