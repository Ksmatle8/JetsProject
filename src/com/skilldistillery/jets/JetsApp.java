package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {
	Scanner input = new Scanner(System.in);
	Airfield airField;
	
	public static void main(String[] args) {
		
		JetsApp ja = new JetsApp();
		ja.run();
	}
	public void run() {
		displayUserMenu();
		
	}
	public JetsApp() {
		airField = new Airfield();
		
	}
	
	public void displayUserMenu() {
		
		System.out.println("Choose an operation: ");
		
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		int num = input.nextInt();
		
		switch (num) {
			//print off all jets
		case 1://Done
			airField.printJets();
			break;
			//calls fly() entire fleet of jets prints out jet details
			//and amount of time the jets can fly till fuel runs out (speed range)
		case 2://Done
			airField.printJets();
			airField.flightTime();
			break;
			//fastest jet with all there info
		case 3://Done
			airField.fastest();
			break;
			//longest range jet with all there info
			//has to search all jets to find right one
		case 4://Done
			airField.longFlight();
			break;
			//all cargo planes
		case 5://Done
			airField.listAllCargo();
			break;
			//dog fight
		case 6:
			break;
			//add a jet JetImpl
		case 7://Not SYSOUT'IN
			airField.addJet(input);
			break;
			//delete a jet shows a sub menu to select a jet to delete by number
		case 8:
			airField.removeJet(input);
			break;
		case 9://Done 
			System.out.println("Exiting Program");
			System.exit(0);
			break;
			default:
			System.out.println("Pick a correct number");
		}
		//Switch statement for user input
		
	}
}

