package notes;

public class ToyBob extends AbstractCat{
	boolean isShortTailed;

	public ToyBob() {
		super();
	}
	
	public ToyBob(String name, double age, Color color, String type, DOB birthDate, boolean isShortTailed) {
		super(name, age, color, type, birthDate);
		// TODO Auto-generated constructor stub
	this.isShortTailed= isShortTailed;
	}
	
	@Override
	public boolean useLitterBox() {
		boolean isClean= true;
		return (isClean)? true : false;
	}
}
