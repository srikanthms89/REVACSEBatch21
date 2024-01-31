package com.tnsif.dayten.markerint;

public class Student implements Registrable {
	private int id;
	private String name;
	private double fees;
	private String course;
	public Student() {
		super();
	}
	public Student(int id, String name, double fees, String course) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
		this.course = course;
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
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + ", course=" + course + "]";
	}
	
	

}
