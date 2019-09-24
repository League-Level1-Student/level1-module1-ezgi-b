package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main (String [] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn do you want?");
		Popcorn butter = new Popcorn(flavor);
		Microwave micro = new Microwave();
		micro.putInMicrowave(butter);
		
		boolean cooked = butter.getIsCooked();
		int cookTime;
		while(!cooked) {
		cookTime = Integer.parseInt(JOptionPane.showInputDialog("How many minutes should it cook for?"));
		micro.setTime(cookTime);
		micro.startMicrowave();
		cooked = butter.getIsCooked();
		}
	}
}
