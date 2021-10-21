package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class ComputerScienceChain implements Chain{

	private Chain nextChain;
	String hscSubject;
	int physicsMarks, chemistryMarks, biologyMarks, mathMarks;
	JSONObject JO = new JSONObject();
	
	@Override
	public void setNext(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}

	@Override
	public JSONArray ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		physicsMarks = request.getPhysicsMarks();
		mathMarks = request.getMathMarks();
		
		
		if (physicsMarks>=6 && mathMarks >= 6) {
			JO.put("name", "Computer Science and Engineering, Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Computer Science and Engineering is not allowed");
			JO.put("name", "Computer Science and Engineering, Not Eligable! Physics Mark = "+ physicsMarks+" & Math = " +mathMarks+" required = 6");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		return allowedSubject;
	}
}
