package com.drf.contest.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

    @Column(nullable = false)
    private String email;

    protected Player() {
    }

    public Player(String name, String email) {
    	super();
    	this.name = name;
    	this.email = email;
    }

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", email=" + email + "]";
	}

}
