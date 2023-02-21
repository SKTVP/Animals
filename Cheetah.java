package Animals;


public class Cheetah extends Animal{

		/**
		 * Constructor linked to the
		 * superclass Animal. Sets hunger to
		 * zero.
		 */
		public Cheetah() {
			super();
		}
		
		/**
		 * Overrides the talk method of the
		 * superclass to have the cheetah speak.
		 */
		public void talk() {
			System.out.println("miaou.");
		}
		
		/**
		 * Overrides the superclass method
		 * to create the cheetah representation.
		 */
		public String toString() {
			return "Cheetah";
		}
	}
