package _06_duck;

import javax.swing.JOptionPane;

public class DuckAndAnimalRunner {
	public static void main(String[] args) {
		Duck daffy = new Duck(JOptionPane.showInputDialog("What is your duck's name?"),JOptionPane.showInputDialog("What is your duck's favorite food? (SINGULAR NOUN)"),Integer.parseInt(JOptionPane.showInputDialog("How many friends does your duck have?")));
			daffy.quack();
			daffy.waddle();
		
		Hawk tobias = new Hawk(JOptionPane.showInputDialog("What is your hawk's name?"), Integer.parseInt(JOptionPane.showInputDialog("How many times has your hawk morphed?")));
			tobias.moveAgainstYeerks();
			tobias.morph("jaguar");
			tobias.moveAgainstYeerks();
		

	}
}