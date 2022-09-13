package hw1;

public interface Edible {
	
	public default String howToCook(String sentence) {
		return sentence;
	}
	public abstract String howToEat(String completion);
}

