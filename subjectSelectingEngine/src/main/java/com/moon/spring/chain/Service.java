package com.moon.spring.chain;

import org.json.JSONObject;

public class Service {
	String hscSubject;
	JSONObject subjectAllowed;
	int physicsMarks, chemistryMarks, biologyMarks, mathMarks;
	
	public Service(String hscSubject, int physicsMarks, int chemistryMarks, int biologyMarks, int mathMarks) {
		super();
		this.hscSubject = hscSubject;
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.biologyMarks = biologyMarks;
		this.mathMarks = mathMarks;
		this.subjectAllowed = new JSONObject();

	}





	public JSONObject getSubjectAllowed() {
		return subjectAllowed;
	}





	public void setSubjectAllowed(JSONObject subjectAllowed) {
		this.subjectAllowed = subjectAllowed;
	}





	public String getHscSubject() {
		return hscSubject;
	}





	public void setHscSubject(String hscSubject) {
		this.hscSubject = hscSubject;
	}





	public int getPhysicsMarks() {
		return physicsMarks;
	}





	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}





	public int getChemistryMarks() {
		return chemistryMarks;
	}





	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}





	public int getBiologyMarks() {
		return biologyMarks;
	}





	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}





	public int getMathMarks() {
		return mathMarks;
	}





	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}





	public void ShowDetails() {
		System.out.println("-----------------------------");
		//System.out.println("Client Name: "+name+" => Problem: "+problem.toUpperCase());
	
	}
}
	

