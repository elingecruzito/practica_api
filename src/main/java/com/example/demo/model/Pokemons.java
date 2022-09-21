package com.example.demo.model;

public class Pokemons {
	
	private Object[] abilities;
	private int baseExperience;
	private Object helditems;
	private int id;
	private String name;
	private String locationarea;
	
	public Pokemons() {
	}
	
	public Pokemons(Object[] abilities, int baseExperience, Object helditems, int id, String name,
			String locationarea) {
		super();
		this.abilities = abilities;
		this.baseExperience = baseExperience;
		this.helditems = helditems;
		this.id = id;
		this.name = name;
		this.locationarea = locationarea;
	}

	public Object[] getAbilities() {
		return abilities;
	}

	public void setAbilities(Object[] abilities) {
		this.abilities = abilities;
	}

	public int getBaseExperience() {
		return baseExperience;
	}

	public void setBaseExperience(int baseExperience) {
		this.baseExperience = baseExperience;
	}

	public Object getHelditems() {
		return helditems;
	}

	public void setHelditems(Object helditems) {
		this.helditems = helditems;
	}

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

	public String getLocationarea() {
		return locationarea;
	}

	public void setLocationarea(String locationarea) {
		this.locationarea = locationarea;
	}
	
}
