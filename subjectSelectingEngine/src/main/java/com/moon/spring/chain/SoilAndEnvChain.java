package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class SoilAndEnvChain implements Chain{

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
		chemistryMarks = request.getChemistryMarks();
		
		
		if (chemistryMarks >= 6) {
			JO.put("name", "Soil and Environmental Science, Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Statistics is not allowed");
			JO.put("name", "Soil and Environmental Science, Not Eligable! Chemisty Mark = "+ chemistryMarks+" required = 6");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		return allowedSubject;
	}
}
