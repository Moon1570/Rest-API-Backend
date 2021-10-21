package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class MathChain implements Chain{

	
	private Chain nextChain;
	String hscSubject;
	JSONObject JO = new JSONObject();
	int physicsMarks, chemistryMarks, biologyMarks, mathMarks;
	
	@Override
	public void setNext(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}

	@Override
	public JSONArray ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		hscSubject = request.getHscSubject();
		mathMarks = request.getMathMarks();
		
		
		if (hscSubject.equalsIgnoreCase("math") && mathMarks>=6) {
			JO.put("name", "Math Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Math is not allowed");
			JO.put("name", "Math Not Eligable! Math Mark = "+ mathMarks+" required = 6");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		
		return allowedSubject;
	}

}
