package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApp {
	Scanner input = new Scanner(System.in);
	Airfield airField = new Airfield();
	
	public static void main(String[] args) {
		
		JetsApp ja = new JetsApp();
		ja.run();
	}
	public void run() {
		displayUserMenu();
		
	}
	public JetsApp() {
		
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
		case 1:
			airField.printJets();
			break;
			//calls fly() entire fleet of jets prints out jet details
			//and amount of time the jets can fly till fuel runs out (speed range)
		case 2:
			break;
			//sysout fastestjet with all there info
			//has to search all jets to find right one
		case 3:
			break;
			//sysout longest range jet with all there info
			//has to search all jets to find right one
		case 4:
			break;
			//sysout all cargo planes
		case 5:
			airField.listAllCargo();
			break;
			
		case 6:
			break;
			//add a jet JetImpl
		case 7:
			break;
			//delete a jet shows a sub menu to select a jet to delete by number
		case 8:
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

