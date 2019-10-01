package _06_duck;

import java.util.Random;

public class Hawk {
	String[] moves = {" is stealing the Andalite toilet from Area 51!", " is attacking a Yeerk Pool!", " is explaining M&Ms to Ax.", " is eating a mouse!"};
	int numberOfMorphs;
	String name;
	int whatMove= new Random().nextInt(4);
	Hawk(String name, int numberOfMorphs){
		this.numberOfMorphs=numberOfMorphs;
		this.name=name;
		System.out.println("A hawk named " + this.name + ",who has morphed " + numberOfMorphs + " times, exists!");
	}
	void moveAgainstYeerks(){
		System.out.println(name + ", who has morphed " + numberOfMorphs + " times," + moves[whatMove]);
		randomize();
	}
	void morph(String animal) {
		System.out.println(name + " is morphing into a " + animal + "!");
		System.out.println(name + " is demorphing!");
		numberOfMorphs++;
	}
	void randomize() {
		whatMove= new Random().nextInt(4);
	}
}
