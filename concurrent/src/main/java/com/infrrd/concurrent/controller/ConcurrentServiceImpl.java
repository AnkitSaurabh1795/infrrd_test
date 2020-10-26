package com.infrrd.concurrent.controller;

import org.springframework.stereotype.Service;

@Service
public class ConcurrentServiceImpl implements ConcurrentService {

	@Override
	public void startProcess() {
		// TODO Auto-generated method stub
		Mylock mylock = new Mylock();
		mylock.heavyProcessing();
		
	}

}
