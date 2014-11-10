package com.drf.contest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Race implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(optional=false)
	private Contest contest;
	
	@Column(nullable=false)
	private Integer raceNumber;

	protected Race() {
	}

	public Contest getContest() {
		return contest;
	}

	public Integer getRaceNumber() {
		return raceNumber;
	}

	@Override
	public String toString() {
		return "Race [contest=" + contest + ", raceNumber=" + raceNumber + "]";
	}

}
