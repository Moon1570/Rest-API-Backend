package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class PhysicsChain implements Chain{

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
		
		
		if (physicsMarks>=6) {
			JO.put("name", "Physics Eligable");
			nextChain.ServiceSupport(request);
			
		} else {
			System.out.println("Physics is not allowed");
			JO.put("name", "Physics Not Eligable! Physics Mark = "+ physicsMarks+" required = 6");
			nextChain.ServiceSupport(request);
		}
		allowedSubject.put(JO);
		return allowedSubject;
	}
}
