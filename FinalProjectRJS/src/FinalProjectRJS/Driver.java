package FinalProjectRJS;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammal mammalOne, mammalTwo;
		
		mammalOne = new Mammal("Chimp",1);
		mammalTwo = new Mammal("Whale",2);
		
		System.out.println("Data for mammal one: " + mammalOne.toString());
		mammalOne.setMammalclass(1);
		System.out.println("Data for mammal one: " + mammalOne.toString());

		System.out.println("Data for mammal two: " + mammalTwo.toString());
		mammalTwo.setMammalclass(2);
		System.out.println("Data for mammal two: " + mammalTwo.toString());
	}

}
