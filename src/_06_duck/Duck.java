package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	String name;
	Duck(String name, String favoriteFood, int numberOfFriends){
		this.favoriteFood=favoriteFood;
		this.numberOfFriends=numberOfFriends;
		this.name=name;
	}
	void quack() {
		System.out.println(name+" is quacking!");
	}
	void waddle() {
		System.out.println(name+" is waddling towards their " + numberOfFriends + " friends with a " + favoriteFood +".");
	}
}
