package hw1;

public class Soup {
	//instance variables
	String noodles;
	
	//constructors
	public Soup() {
		noodles= "alphabet letters";
	}
	public Soup(String noodles) {
		this.noodles= noodles;
	}
	
	//getters and setters
	public String getNoodles() {
		return noodles;
	}

	public void setNoodles(String noodles) {
		this.noodles = noodles;
	}
	
	//implementation of abstract method
	public String howToEat(String test) {
		return test;
	}
	
	public void howToCook(String noodle) {
		System.out.println("Place chicken  broth, vegtables, and "+noodle+"all together.");
	}
	
	//toString 
	@Override
	public String toString() {
		return "The soup noodles are " +noodles;
	}			
}

//toString()=" + super.toString() + "]";