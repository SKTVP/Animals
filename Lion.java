package Animals;

 
public class Lion extends Animal {
	
	/**
	 * Constructor linked to the
	 * superclass Animal. Sets hunger to
	 * zero.
	 */
	public Lion() {
		super();
	}
	
	/**
	 * Overrides the talk method of the
	 * superclass to have the lion speak.
	 */
	public void talk() {
		System.out.println("Roar!");
	}
	
	/**
	 * Overrides the timePasses superclass
	 * method in order to have the lion
	 * pace when hunger reaches greater than
	 * 3.
	 */
	public void timePasses() {
		super.timePasses();
		if (super.getHunger() >= 3) {
			System.out.println("To liontari peinaei!!!.");
		}
	}
	
	/**
	 * Overrides the superclass method
	 * to create the lion representation.
	 */
	public String toString() {
		return "Lion";
	}
}