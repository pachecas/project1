package catclient;

import notes.AbstractCat;
import notes.Color;

public class TestAbstractCat {
	public static void main (String [] args) {
		AbstractCat prince= new AbstractCat();
		System.out.println(prince);
		
		prince.setName("Prince");
		prince.setAge(0.8);
		prince.setColor(Color.LAVENDER);
		System.out.println(prince);
		
		AbstractCat betty= new AbstractCat("Betty", 0.25, Color.RED, "Domestic");
		System.out.println(betty);
		
		betty.setType("Feral");
		System.out.println(betty.getType());
		System.out.println(betty);
		
	}
}
