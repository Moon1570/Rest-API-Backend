package com.moon.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moon.spring.chain.ChainOfResponsibility;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/")
public class SubjectController {
	
	//Create Employee Rest API
		@PostMapping("/subjects")
		public ResponseEntity<Object> sendMail(@RequestBody String data) {
            //... the email is the string can be converted to Json using new JSONObject(email) or using jackson.
			
			JSONArray subjects =  new JSONArray();
			subjects = ChainOfResponsibility.getSubjects(data);

			
			
            return ResponseEntity.ok(subjects.toString());
        }
}
