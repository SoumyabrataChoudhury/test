package mainclass;

import package01.Satya;
import package01.Soumya;

public class DemoEnum02 {

	public static void main(String[] args) {
		System.out.println("Display from Enums\n");
		
		for(Satya q:Satya.values()) {
			System.out.println(q);
		}
		
		System.out.println("\n-------------------------------------------------------------\n");
		
		for(Soumya r:Soumya.values()) {
			System.out.println(r);
		}
	}

}
