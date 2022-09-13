package hw1;

public class Sushi implements Edible{
	//instance variables
	String fish;
	
	//constructors
	public Sushi() {
		fish= "Salmon";
	}
	
	public Sushi(String fish) {
		this.fish= fish;
	}
	
	//getters and setters
	public String getFish() {
		return fish;
	}

	public void setFish(String fish) {
		this.fish = fish;
	}
	
	//implementation of abstract method
	public String howToEat(String test) {
		return test;
	}
	
	public void howToCook(String fishy) {
		System.out.println("Put the rice, extras, and "+fishy+" ontop of the seaweed and roll it together.");
	}
	
	//toString
	public String toString() {
		return "The fish in the sushi is " +fish;
	}
}
