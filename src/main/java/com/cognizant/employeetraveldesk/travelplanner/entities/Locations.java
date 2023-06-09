package com.cognizant.employeetraveldesk.travelplanner.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Locations")
@NoArgsConstructor
@Getter
@Setter
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "name", length = 20)
	private String name;
	
	@OneToMany(mappedBy="locations")
	private List<TravelRequests> travelRequests;
	 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Locations() {
		super();
		// TODO Auto-generated constructor stub
	}


}
