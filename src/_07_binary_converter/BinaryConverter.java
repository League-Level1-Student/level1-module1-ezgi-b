package _07_binary_converter;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	JFrame frame;
	JPanel panel;
	JTextField answer;
	void createUI(){
		frame = new JFrame("Binary Converter!");
		panel = new JPanel();
		answer = new JTextField();
		frame.add(panel);
		
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
	public static void main(String[] args) {
		BinaryConverter converter = new BinaryConverter();
		converter.createUI();
	}
}
