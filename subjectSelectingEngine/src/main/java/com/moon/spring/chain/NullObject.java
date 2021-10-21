package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;
public class NullObject implements Chain{
	private Chain nextChain;

	@Override
	public void setNext(Chain nextChain) {
		// TODO Auto-generated method stub
		this.nextChain =  nextChain;
	}


	@Override
	public JSONArray ServiceSupport(Service request) {
		// TODO Auto-generated method stub
		System.err.println("None Can Solve");
		JSONObject JO = new JSONObject();
		JO.put("name", "___________");
		allowedSubject.put(JO);
		return allowedSubject;
	}

}
