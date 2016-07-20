package com.msrm.springframework.di;

public class Report {

	private int id;

	private String description;

	public Report() {
	}

	public Report(int id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Report [id=" + id + ", description=" + description + "]";
	}

}
