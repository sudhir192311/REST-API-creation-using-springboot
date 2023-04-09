package com.example.devtools.entities;

public class Book {
	private int id;
	private String name;
	private String status;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Book(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", status=" + status + "]";
	}

}
