package com.designpattern.owntest;

import java.util.Iterator;

public class Threader implements Runner{
	private Runner runnner;
	
	



	public Threader(Runner runnner) {
		super();
		this.runnner = runnner;
	}

	public Runner getRunnner() {
		return runnner;
	}

	public void setRunnner(Runner runnner) {
		this.runnner = runnner;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public void start() {
		runnner.run();
	}
	
	public void start(int runTimes) {
		for (int i  = 0; i < runTimes ; i++) {
			runnner.run();
		}
		
	}

}
