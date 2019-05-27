package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	List<Jet> jets;
	String fileName = "jets.txt";

	public Airfield() {
		// Read in the file fill array like planets list of jets
		readJets(fileName);
		// jets = new ArrayList<Jet>();
	}

	private List<Jet> readJets(String fileName) {
		BufferedReader br = null;
		// add code to open file
		jets = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				// print out each line
				Jet j = null;
				String[] jetRecord = line.split(", ");
				String model = jetRecord[1];
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);
				String type = jetRecord[0];
				if (type.equalsIgnoreCase("Cargo")) {
					j = new CargoPlane(type, model, speed, range, price);
				}
				if (type.equalsIgnoreCase("Fighter")) {
					j = new FighterJet(type, model, speed, range, price);
				}
				jets.add(j);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return jets;
	}

	// case1 all jets
	public void printJets() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
	}

	//case2 Print and Fly()
	public void flightTime() {
		double inSky;
		for (Jet jet : jets) {
			String model = jet.getModel();
			int range = jet.getRange();
			double speed = jet.getSpeed();
			inSky = range / speed;
			System.out.println(model + ":   ");
			System.out.printf("%.2f", inSky);
			System.out.println(" hours");
		}
	}
	
	// case3 fastest jet
	public void fastest() {
		Jet fastJet = null;
		double fastest = 0;
		for (Jet jet : jets) {
			if (fastest < jet.getSpeed()) {
				fastest = jet.getSpeed();
				fastJet = jet;
			}
		}
		System.out.println(fastJet.getModel() + " " + fastest + " mph ");
		fastJet.getMach();
	}
	
	//case4 longest flight
	public void longFlight() {
		Jet longJet = null;
		double longest = 0;
		for (Jet jet : jets) {
			if(longest < jet.getRange()) {
				longest = jet.getRange();
				longJet = jet;
			}
		}
		System.out.println(longJet.getModel() + " " + longest + " Miles ");
	}
	
	// case5 List all cargo jets
	public void listAllCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
				// System.out.println(jets);
			}
		}
	}
	// case6
	
	//case7 add a Jet
	public void addJet(Scanner input) {
		Jet newJet = null;
		Long price = input.nextLong();
		System.out.print("Cargo or fighter Type: ");
		System.out.println("Enter a Jet Name: ");
		String model = input.next();
		System.out.print("Speed: ");
		Double speed = input.nextDouble();
		System.out.print("Range: ");
		int range = input.nextInt();
		System.out.print("Price: $");
		String type = input.next();
		newJet = new JetImpl(type, model, speed, range, price);
		jets.add(newJet);
		System.out.println();
		System.out.println("New inventory: ");
		printJets();
		System.out.println();
		
	}
	
	//case8 remove jet
	public void removeJet (Scanner input) {
		Jet newJet = null;
		System.out.print("Cargo or fighter Type: ");
		String type = input.next();
		System.out.println("Enter a Jets Name: ");
		String model = input.next();
		System.out.print("Speed: ");
		Double speed = input.nextDouble();
		System.out.print("Range: ");
		int range = input.nextInt();
		System.out.print("Price: $");
		Long price = input.nextLong();
		newJet = new JetImpl(type, model, speed, range, price);
		jets.add(newJet);
		System.out.println();
		System.out.println("New inventory: ");
		printJets();
		System.out.println();
	}

	@Override
	public String toString() {
		return "Airfield [jets=" + jets + "]";
	}

	public List<Jet> getJets() {
		return jets;
	}

	public void setJets(List<Jet> jets) {
		this.jets = jets;
	}
}
