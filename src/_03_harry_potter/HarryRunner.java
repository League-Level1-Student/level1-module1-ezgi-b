package _03_harry_potter;

public class HarryRunner {
	public static void main(String [] args) {
		HarryPotter bob = new HarryPotter();
		bob.makeInvisible(true);
		bob.spyOnSnape();
		bob.makeInvisible(false);
		bob.castSpell("Stupefy","Snape");
	}
}



/* Create a HarryRunner class in the harry_potter package with a main method.
 * The main method should:
 * 
* 1. create harry potter
* 2. make him become invisible
* 3. spy on Professor Snape
* 4. make him become visible again
* 5. cast a “stupefy” spell
*/