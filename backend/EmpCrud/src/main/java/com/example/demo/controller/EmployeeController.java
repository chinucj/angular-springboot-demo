package com.example.demo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@GetMapping("/demo")
	public ResponseEntity<Map<String, Object>> demoApiTest(){
		Map<String, Object> demoMap = new HashMap<>();
		demoMap.put("message", "Demo api working perfectly");
		return ResponseEntity.ok(demoMap);
	}
}
