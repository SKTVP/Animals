package Animals;



public class Zebra extends Animal {
	
	/**
	 * Constructor linked to the
	 * superclass Animal. Sets hunger to
	 * zero.
	 */
	public Zebra() {
		super();
	}
	
	/**
	 * Overrides the talk method of the
	 * superclass to have the zebra speak.
	 */
	public void talk() {
		System.out.println("i zebra mourmourizei.");
	}
	
	/**
	 * Overrides the superclass method
	 * to create the zebra representation.
	 */
	public String toString() {
		return "Zebra";
	}	
}