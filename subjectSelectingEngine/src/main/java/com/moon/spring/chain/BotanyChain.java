package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class BotanyChain implements Chain{
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
		biologyMarks = request.getBiologyMarks();
		hscSubject = request.getHscSubject();
		
		if (biologyMarks >= 6 && hscSubject.equalsIgnoreCase("biology")) {
			JO.put("name", "Botany, Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Statistics is not allowed");
			JO.put("name", "Botany, Not Eligable! Biology Mark = "+ biologyMarks+" required = 6");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		return allowedSubject;
	}
}
