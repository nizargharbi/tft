package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Club
 *
 */
@Entity

public class Club implements Serializable {

	   
	@Id
	private String idclub;
	private String name;
	@OneToMany(mappedBy="club")
	private Collection<Player> players;
	
	public Collection<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	private static final long serialVersionUID = 1L;

	public Club() {
		super();
	}   
	public String getIdclub() {
		return this.idclub;
	}

	public void setIdclub(String idclub) {
		this.idclub = idclub;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
