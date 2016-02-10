package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.String;
import java.util.Collection;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Club
 *
 */
@Entity

public class Club implements Serializable {

	   
	
	private String idclub;
	private String name;
	
	private List<Player> players;
	
	
	@OneToMany(mappedBy="club")
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	private static final long serialVersionUID = 1L;

	public Club() {
		super();
	}  
	@Id
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
