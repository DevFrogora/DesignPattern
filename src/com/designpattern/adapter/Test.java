package com.designpattern.adapter;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		WallSocket wallSocket = new WallSocketImpl();
//		Volt v240 = wallSocket.getVolts();
//		System.out.println(v240);
		
		MobileAdapter mobileAdapter = new MobileAdapterImpl(new WallSocketImpl());
		Volt v3 = mobileAdapter.get3Volt();
		System.out.println(v3);
		

	}

}
