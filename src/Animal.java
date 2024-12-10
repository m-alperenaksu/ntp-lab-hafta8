
public class Animal {
	protected int legs;

	protected Animal(int legs) {
		this.legs = legs;
	}
	
	public void walk() {
		System.out.println("Hayvan yürüdü.");
	}
	
	public void eat() {
		System.out.println("Hayvan yedi.");
	}
	
	public void setLegs(int legs) {
		this.legs = legs;
	}
	
	public int getLegs() {
		return legs;
	}
}
