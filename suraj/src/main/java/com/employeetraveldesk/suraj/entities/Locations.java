package com.employeetraveldesk.suraj.entities;

import javax.persistence.*;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="locations")
@NoArgsConstructor
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Name", length = 20)
	private String name;
	
	@OneToMany(mappedBy="locationId" , cascade=CascadeType.ALL)
	private TravelRequests travelRequests;

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
