package com.moon.spring.chain;

import org.json.JSONArray;
import org.json.JSONObject;

public class ChainOfResponsibility {

	public static JSONArray getSubjects(String data) {
		JSONArray allowedSubject = new JSONArray();
		JSONObject obj = new JSONObject(data);
		int mathMarks = Integer.parseInt((String) obj.get("mathMarks"));
		int physicsMarks = Integer.parseInt((String) obj.get("physicsMarks"));
		int chemistryMarks = Integer.parseInt((String) obj.get("chemistryMarks"));
		int biologyMarks = Integer.parseInt((String) obj.get("biologyMarks"));

		System.out.println(obj.toString());
		
		String hscSubject = (String) obj.get("hscSubjects");
		
		
		
		Chain c1 = new MathChain();
		Chain c2 = new ChemistryChain();
		Chain c3 = new PhysicsChain();
		Chain c4 = new GeologyAndMiningChain();
		Chain c5 = new ComputerScienceChain();
		Chain c6 = new StatChain();
		Chain c7 = new SoilAndEnvChain();
		Chain c8 = new BotanyChain();
		Chain c9 = new CoastalAndDisasterChain();
		Chain c10 = new BiochemistryAndBioTechChain();
		Chain last = new NullObject();
		
		c1.setNext(c2);
		c2.setNext(c3);
		c3.setNext(c4);
		c4.setNext(c5);
		c5.setNext(c6);
		c6.setNext(c7);
		c7.setNext(c8);
		c8.setNext(c9);
		c9.setNext(c10);
		c10.setNext(last);
		
		
		Service request = new Service(hscSubject, physicsMarks, chemistryMarks, biologyMarks, mathMarks);
		allowedSubject = c1.ServiceSupport(request);

		System.out.println("COR: " + allowedSubject.toString());
		
		System.out.println();
		
		return allowedSubject;
		// TODO Auto-generated method stub
		
	}

	
}
