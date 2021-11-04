package com.designpattern;



enum Level{
	LOW,MEDIUM,HIGH;
}

public class Test {
	public static void main(String[] args) {
		
//		System.out.println(Level.HIGH);
		
		Level input = Level.HIGH;
		
		switch (input) {
		case HIGH : {
			
			System.out.println(Level.HIGH);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		
	}

}
