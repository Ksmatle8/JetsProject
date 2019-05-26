package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Airfield {
	private List<Jet> jets;

	public Airfield() {

		// Read in the file fill array like planets list of jets

		String fileName = "jets.txt";
		readJets(fileName);
	}

	private void readJets(String fileName) {
		BufferedReader br = null;
		// add code to open file
		jets = new ArrayList<>();
		try {
			br = new BufferedReader(new FileReader(fileName));
			String line;
			while ((line = br.readLine()) != null) {
				// print out each line
				String[] jetRecord = line.split(", ");
				String type = jetRecord[0];
				String model = jetRecord[1];
				double speed = Double.parseDouble(jetRecord[2]);
				int range = Integer.parseInt(jetRecord[3]);
				long price = Long.parseLong(jetRecord[4]);
				Jet j = new JetImpl(type, model, speed, range, price);
				jets.add(j);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	//List all cargo jets
	public void listAllCargo() {
		for (Jet jet : jets) {
			if (jet instanceof CargoCarrier) {
				((CargoCarrier) jet).loadCargo();
			}
		}
	}
	

	public void printJets() {
		for (Jet jet : jets) {
			System.out.println(jet);
		}
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
