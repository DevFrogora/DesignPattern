package com.designpattern.adapter;

public class MobileAdapterImpl implements MobileAdapter {
	
	// 

	private WallSocket wallSocket;
	
	
	public MobileAdapterImpl(WallSocket wallSocket) {
		super();
		this.wallSocket = wallSocket;
	}


	@Override
	public Volt get3Volt() {
		// TODO Auto-generated method stub
		Volt v240 = wallSocket.getVolts();
		int v3 = v240.getVolts()/80;
		return new Volt(v3);
	}

}
