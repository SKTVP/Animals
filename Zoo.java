package Animals;

public class Zoo {

	/**
	 * Fields to hold an Animal.
	 */
	private Animal cage1;
	private Animal cage2;
	private Animal cage3;
	
	/**
	 * Fields to define a specific type
	 * of Animal
	 */
	private Lion lion;
	private Cheetah cheetah;
	private Zebra zebra;
	
	/**
	 * Constructor to set all of
	 * the cages to empty.
	 */
	public Zoo() {
		cage1 = null;
		cage2 = null;
		cage3 = null;

		lion = new Lion();
		cheetah = new Cheetah();
		zebra = new Zebra();
	}
	
	/**
	 * Place an animal into cage 1.
	 * 
	 * @param animal the specific animal
	 */
	public void putInCage1(Animal animal) {
		cage1 = animal;
	}
	
	/**
	 * Place an animal into cage 2.
	 * 
	 * @param animal the specific animal
	 */
	public void putInCage2(Animal animal) {
		cage2 = animal;
	}
	
	/**
	 * Place an animal into cage 3.
	 * 
	 * @param animal the specific animal
	 */
	public void putInCage3(Animal animal) {
		cage3 = animal;
	}
	
	/**
	 * Print the animals that are in the Zoo.
	 */
	public void printZoo() {
		System.out.println("o zoologikos kipos apoteleitai apo:");
		if(cage1 != null) {
			System.out.println("\t" + cage1);
		}
		
		if(cage2 != null) {
			System.out.println("\t" + cage2);
		}
		
		if(cage3 != null) {
			System.out.println("\t" + cage3);
		}			  
	}
	
	/**
	 * Allow the animals to get hungry if they are in the zoo.
	 */
	public void timePasses() {
		if (cage1 instanceof Zebra || cage2 instanceof Zebra || cage3 instanceof Zebra) {
			zebra.timePasses();
		}
		
		if (cage1 instanceof Lion || cage2 instanceof Lion || cage3 instanceof Lion) {
			lion.timePasses();
		}
		
		if (cage1 instanceof Cheetah || cage2 instanceof Cheetah || cage3 instanceof Cheetah) {
			cheetah.timePasses();
		}
	}
	
	/**
	 * Have the animals in the zoo talk.
	 */
	public void allTalk() {
		if (cage1 instanceof Zebra || cage2 instanceof Zebra || cage3 instanceof Zebra) {
			zebra.talk();
		}
		
		if (cage1 instanceof Lion || cage2 instanceof Lion || cage3 instanceof Lion) {
			lion.talk();
		}
		
		if (cage1 instanceof Cheetah || cage2 instanceof Cheetah || cage3 instanceof Cheetah) {
			cheetah.talk();
		}
	}
	
	/**
	 * Feed the animals in the zoo.
	 */
	public void feedAll() {
		if (cage1 instanceof Zebra || cage2 instanceof Zebra || cage3 instanceof Zebra) {
			zebra.food();
		}
		
		if (cage1 instanceof Lion || cage2 instanceof Lion || cage3 instanceof Lion) {
			lion.food();
		}
		
		if (cage1 instanceof Cheetah || cage2 instanceof Cheetah || cage3 instanceof Cheetah) {
			cheetah.food();
		}
	}
}