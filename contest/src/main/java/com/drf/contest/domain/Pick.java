package com.drf.contest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pick implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@ManyToOne(optional=false)
	private Player player;
	
	@ManyToOne(optional=false)
	private Race race;
	
	@ManyToOne(optional=false)
	private Horse horse;
	
	protected Pick() {
	}
	
	public Pick(Player player, Race race, Horse horse) {
		super();
		this.player = player;
		this.race = race;
		this.horse = horse;
	}

	public Player getPlayer() {
		return player;
	}

	public Race getRace() {
		return race;
	}

	public Horse getHorse() {
		return horse;
	}

	@Override
	public String toString() {
		return "Pick [player=" + player + ", race=" + race + ", horse=" + horse
				+ "]";
	}

}
