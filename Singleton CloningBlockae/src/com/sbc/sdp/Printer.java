package com.sbc.sdp;

public class Printer {
	
	     //;//eager Instantiation
	
	private static class InnerPrinter{
		private static volatile Printer OBJECTNAME= new Printer();
	}//static innerClass
	private Printer() {
		System.out.println("o-param con....");
	}
	
	public static Printer getInstance() {
	
		return InnerPrinter.OBJECTNAME;
	}
	
	@Override
	public Object clone()throws CloneNotSupportedException{
		return InnerPrinter.OBJECTNAME;
		//throw new CloneNotSupportedException("Clonning not Alloed in singleton printer class");
		
		
	}
	
	
	
	
	public void print(String msg) {		//No O/P
		System.out.println(msg);
	}//print()

}//class
