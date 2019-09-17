package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main (String [] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn butter = new Popcorn(flavor);
		Microwave micro = new Microwave();
		micro.putInMicrowave(butter);
		String cookTime = JOptionPane.showInputDialog("How many minutes should it cook for?");
	}
}
