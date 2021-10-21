package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

interface Chain {
	public void setNext(Chain nextChain);
	public JSONArray ServiceSupport(Service request);
	public JSONArray allowedSubject = new JSONArray();
}

