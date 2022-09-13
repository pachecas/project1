package notes;

/*enum Color{
	WHITE, CREAM, FAWN, CINNAMON, CHOCOLATE, RED, LILAC, BLUE, BLACK, LAVENDER
}
*/

public class Cat {
	String name;
	double age; //in years
	Color color; //we will limit color choice
	String type; // (domestic/ feral)
	static int numberOfCats;
	
	/*String eat() {
		return "favorite food";
	}
	
	boolean play(String toy) {
		return false;
	}
	*/
	public Cat(){}
	public Cat(String name){
		this.name= name;
	}
	public Cat(String name, double age, Color color, String type) {
		super();
		this.name = name;
		this.age = age;
		this.color = color;
		this.type = type;
	}
	Cat(String name, String breed){
		this.name= name;
		System.out.println(breed);
	}

	//methods
	public static int getNumberOfCats() {
		return numberOfCats;
	}
	
	String eat() {
		return "favorite food";
	}
	
	boolean play(String toy) {
		return false;
	}
}

/*project= unit 1
package= notes
class= cat */


/*
Color arr[] =Color.values();
for (Color col: arr)
	System.out.println(col + " at the index "+)
*/