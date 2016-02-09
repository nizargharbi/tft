package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Game
 *
 */
@Entity

public class Game implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idgame;

	private String type;

	@ManyToOne
	@JoinColumn(name = "id_competiton")
	private Competition competition;

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	@ManyToOne
	@JoinColumn(name = "id_refree")
	private Refree refree;
	@ManyToOne
	@JoinColumn(name = "id_stadium")
	private Stadium stadium;  
	@ManyToMany
	@JoinTable(
		name="game_player",
		joinColumns = @JoinColumn(name="id_game"),
		inverseJoinColumns = @JoinColumn(name="id_player")
	)
	private Collection<Player> players;
	
		
	



	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public Refree getRefree() {
		return refree;
	}

	public void setRefree(Refree refree) {
		this.refree = refree;
	}

	public Collection<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	private static final long serialVersionUID = 1L;

	public Game() {
		super();
	}

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
