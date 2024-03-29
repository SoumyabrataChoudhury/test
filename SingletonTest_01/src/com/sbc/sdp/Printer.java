package com.sbc.sdp;

public class Printer {
	
	private static Printer OBJECTNAME;
	
	private Printer() {
		System.out.println("o-param con....");
	}
	
	public static Printer getInstance() {
		//singleton logic 
		if(OBJECTNAME==null) {
			OBJECTNAME= new Printer();
		}//method
		return OBJECTNAME;
	}
	
	public void print(String msg) {
		System.out.println(msg);
	}//print()

}//class
