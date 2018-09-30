package com.sfg.petshop.model;

import java.time.LocalDate;

public class Pet {

	
	private PetType petType;
	
	private Owner owner;
	
	private LocalDate bDay;

	public PetType getPetType() {
		return petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public LocalDate getbDay() {
		return bDay;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public void setbDay(LocalDate bDay) {
		this.bDay = bDay;
	}
	
}
