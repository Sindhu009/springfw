package com.xworkz.switchboard;

public class TesterSwitchBoard {
	public static void main(String args[]) {
		int pin=8;
		Charger charger=new Charger();
		charger.setNoOfPins(pins);
		String b="HiFi";
		SwitchBoard board=new SwitchBoard(charger);
		board.supplyPower();
	}

}
