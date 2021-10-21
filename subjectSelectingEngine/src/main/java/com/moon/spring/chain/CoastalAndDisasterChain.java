package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class CoastalAndDisasterChain implements Chain{
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
		mathMarks = request.getMathMarks();
		physicsMarks = request.getPhysicsMarks();
		
		if (mathMarks >= 6 && physicsMarks >=6) {
			JO.put("name", "Costal and Disaster Management, Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Costal and Disaster Management is not allowed");
			JO.put("name", "Costal and Disaster Management, Not Eligable! Math Mark = "+ mathMarks+ " Physics = "+ physicsMarks +" required = 6");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		return allowedSubject;
	}
}
