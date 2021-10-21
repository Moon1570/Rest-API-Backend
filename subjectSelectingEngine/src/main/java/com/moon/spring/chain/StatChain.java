package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class StatChain implements Chain{
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
		hscSubject = request.getHscSubject();
		
		
		if (hscSubject.equalsIgnoreCase("Math")) {
			JO.put("name", "Statistics, Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Statistics is not allowed");
			JO.put("name", "Statistics, Not Eligable!");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		return allowedSubject;
	}
}
