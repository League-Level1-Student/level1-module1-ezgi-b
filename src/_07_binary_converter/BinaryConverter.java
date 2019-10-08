package _07_binary_converter;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField answer;
	JButton buttonConvert;
	void createUI(){
		frame = new JFrame("Binary Converter!");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(3);
		frame.setPreferredSize(new Dimension (500,250));
		panel = new JPanel();
		answer = new JTextField();
		answer.setPreferredSize(new Dimension(200,20));
		buttonConvert = new JButton("Convert binary to ASCII!");
		buttonConvert.addActionListener(this);
		frame.add(panel);
		panel.add(answer);
		panel.add(buttonConvert);
		frame.pack();
		
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
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,convert(answer.getText()));
	}
}
