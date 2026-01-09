package com.javafxapplicationtest.objects;

public class PersonalComputer {
	private String name;
	private String type;
	private String ram;

	public PersonalComputer() {}

	public PersonalComputer(String name, String type, String ram) {
		this.ram = ram;
		this.type = type;
		this.name = name;
	}

	public String getRam() {
		return this.ram;
	}
	public String getName() {
		return this.name;
	}
	public String getType() {
		return this.type;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setType(String type) {
		this.type = type;
	}
}