package notes;

/*enum Color{
	WHITE, CREAM, FAWN, CINNAMON, CHOCOLATE, RED, LILAC, BLUE, BLACK, LAVENDER
}
*/

public abstract class AbstractCat {

	private String name;
	private double age; //in years
	private Color color; //we will limit color choice
	private String type; // (domestic/ feral)
	static int numberOfCats;
	private DOB birthDate;
	
	//constructors
	public AbstractCat() {
		
	}
	
	public AbstractCat(String name, double age, Color color, String type) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
	}
	
	public AbstractCat(String name, double age, Color color, String type, DOB birthDate) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
		this.birthDate = birthDate;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAge() {
		return age;
	}

	public void setAge(double age) {
		this.age = age;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public DOB getBirthDate() {
		return birthDate;
	}
	
	//custom classes
	public static int getNumberOfCats() {
		return numberOfCats;
	}
	public static void setNumberOfCats(int numberOfCat) {
		AbstractCat.numberOfCats= numberOfCat;
	}
	
	//custom methods
	String eat() {
		return "favorite food";
	}
	
	boolean play(String toy) {
		return false;
	}
	
	public abstract boolean useLitterBox();
	
	//toString
	@Override
	public String toString() {
		return "AbstractCat [name=" + name + ", age=" + age + ", color=" + color + ", type=" + type + ", birthDate="
				+ birthDate + "]";
	}
}
