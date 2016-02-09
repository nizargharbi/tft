package com.esprit.tft.pidev.domain;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Session
 *
 */
@Entity


public class Session implements Serializable {

	   
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idsession;
	private String venue;
	private String openingdate;
	private String closingdate;
	@ManyToMany
	@JoinTable(
			name="session_referee",
			joinColumns = @JoinColumn(name="id_session"),
			inverseJoinColumns = @JoinColumn(name="id_refree")
		)
	private List<Refree> refrees;
	private static final long serialVersionUID = 1L;

	public Session() {
		super();
	}   
	public Integer getIdsession() {
		return this.idsession;
	}

	public void setIdsession(Integer idsession) {
		this.idsession = idsession;
	}   
	public String getVenue() {
		return this.venue;
	}

	public void setVenue(String venue) {
		this.venue = venue;
	}   
	public String getOpeningdate() {
		return this.openingdate;
	}

	public void setOpeningdate(String openingdate) {
		this.openingdate = openingdate;
	}   
	public String getClosingdate() {
		return this.closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate;
	}
	
	public List<Refree> getRefrees() {
		return refrees;
	}
	public void setRefrees(List<Refree> refrees) {
		this.refrees = refrees;
	}
   
}
