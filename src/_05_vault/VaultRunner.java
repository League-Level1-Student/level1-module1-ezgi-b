package _05_vault;

import javax.swing.JOptionPane;

public class VaultRunner {
	public static void main(String[] args) {
		Bond James = new Bond();
		Vault vault = new Vault();
		JOptionPane.showMessageDialog(null, "The code is " +James.findCode(vault)+"!!!");
	}

}
