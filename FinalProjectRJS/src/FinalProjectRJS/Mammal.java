package FinalProjectRJS;

public class Mammal {
	
	private String name;
	private int mammalclass; // 1= land 2= water
	
	public Mammal(String mammalName, int thisMammalClass) {
		name = mammalName;
		mammalclass = thisMammalClass;
	}
	
	public String toString() {
		return "Mammal class: " + mammalClass + "is named" + name;
	}
	
	public String getName() {
		return name;
	}
	public String getMammalclass() {
		return mammalclass;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	public void setMammalclass(String newMammalclass) {
		mammalclass = newMammalclass;
	}


}
