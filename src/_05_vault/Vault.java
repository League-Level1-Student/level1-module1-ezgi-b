package _05_vault;

import java.util.Random;

public class Vault {
	
	int secretCode;
	Vault(){
		secretCode= new Random().nextInt(1000001);
	}
	public boolean tryCode(int codeToTry) {
		return secretCode==codeToTry;
	}
}
