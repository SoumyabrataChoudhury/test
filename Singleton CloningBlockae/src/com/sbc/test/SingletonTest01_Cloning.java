package com.sbc.test;

import com.sbc.sdp.Printer;

public class SingletonTest01_Cloning {

	public static void main(String[] args) {

		Printer p1= Printer.getInstance();
		
		//do cloning on Object
		try {
			
			Printer p2=(Printer)p1.clone();
			System.out.println("Cloned Object is Created");
			System.out.println(p1.hashCode()+"\t"+p2.hashCode());
			System.out.println("p1==p2  ?="+(p1==p2));
		}//try
		catch(CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}//catch
	}

}
