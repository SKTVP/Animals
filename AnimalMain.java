package Animals;

public class AnimalMain {
	
	/**
	 * The main class to test the various methods
	 * of Animal and Zoo.
	 * 
	 \
	 */
	public static void main(String[] args) {
		Animal zebra = (Animal) new Zebra();
		Animal cheetah = new Cheetah();
		Animal leon = new Lion();
		
		Zoo test = new Zoo();
		test.putInCage1(zebra);
		test.putInCage3(cheetah);
		test.putInCage2(leon);
		test.printZoo();
		
		test.timePasses();
		test.timePasses();
		test.timePasses();
		test.allTalk();
		
		test.feedAll();
		test.timePasses();
		test.timePasses();
	
		
	}
}