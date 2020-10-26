package com.infrrd.concurrent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConcurrentController {
	@Autowired
	private ConcurrentService concurrentService;
	@PutMapping("/api/start")
	public void startProcess() {
		concurrentService.startProcess();
	}
	
}
