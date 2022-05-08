package com.manager.app;

public class Apperance {
	public static void print() {
		//char dimond = '\u2666';
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("");
		for (int i = 0; i < 16; i++) {
			System.out.print("-");
		}
		System.out.print("* Smart Vehicle Parking *");
		for (int i = 0; i < 16; i++) {
			System.out.print("-");
		}
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("");
		System.out.println("                  Welcome Manager!");
		System.out.println("");
		System.out.println("      Please Choose from below options-");
		System.out.println("");
		System.out.println("      1. RegistrationDetails");
		System.out.println("      2. BillingDetails");
		System.out.println("      3. CurrentParkedVehicles");
		System.out.println("      4.Receptionist_Data");
		System.out.println("");
		System.out.println("      Press (n) to exit...");
		System.out.println("");
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}


}
