package com.drf.contest.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Contest implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(optional=false)
	private Track track;
	
	@Column
	private Date date;
	
	protected Contest() {
	}

	public Contest(Track track, Date date) {
		super();
		this.track = track;
		this.date = date;
	}

	public Track getTrack() {
		return track;
	}

	public Date getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "Contest [track=" + track + ", date=" + date + "]";
	}

}
