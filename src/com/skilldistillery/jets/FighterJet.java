package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String type,String model, double speed, int range, long price) {
		super(type, model, speed, range, price);
	}

	public void flight() {
		System.out.println("I can fly");
	}
	

	@Override
	public void fight() {
		System.out.print("I can fight");
	}
	
}
