package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Game
 *
 */
@Entity

public class Game implements Serializable {

	
	private Integer idgame;
	private Date Date;
	private String type;
	private Stadium stadium;
	private List<Player> players;
	
	
	
	
	
	
	
	public Date getDate() {
		return Date;
	}
	public void setDate(Date date) {
		Date = date;
	}
	
	
	
//	public Game(Integer idgame, java.util.Date date, String type, Competition competition, Refree refree,
//			Stadium stadium, List<Player> players) {
//		super();
//		this.idgame = idgame;
//		Date = date;
//		this.type = type;
//		this.competition = competition;
//		this.refree = refree;
//		this.stadium = stadium;
//		this.players = players;
//	}

	



	private Competition competition;

	@ManyToOne
	@JoinColumn(name = "id_competiton")
	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	
	private Refree refree;
	
//	@JoinTable(
//	name="game_player",
//	joinColumns = @JoinColumn(name="id_game"),
//	inverseJoinColumns = @JoinColumn(name="id_player")
//)
	
	@ManyToMany
	public List<Player> getPlayers() {
		return players;
	}


		




	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}
	@ManyToOne
	@JoinColumn(name = "id_refree")
	public Refree getRefree() {
		return refree;
	}

	public void setRefree(Refree refree) {
		this.refree = refree;
	}


	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	private static final long serialVersionUID = 1L;

	public Game() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdgame() {
		return this.idgame;
	}

	public void setIdgame(Integer idgame) {
		this.idgame = idgame;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
