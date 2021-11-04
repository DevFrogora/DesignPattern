package com.designpattern.owntest;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Threader threader = new  Threader(new Runner() {
			int a=1;
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Hi "+a++);
				
			}
		});
		threader.start(10);
	}

}
