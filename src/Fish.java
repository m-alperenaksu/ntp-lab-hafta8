
public class Fish extends Animal implements Pet {
	private String name;
	
	Fish(){
		super(0);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println(getName() + " Balık oynadı.");
	}
	
	public void walk() {
		System.out.println(getName() + " Balık yüzdü.");
		
	}
	
	public void eat() {
		System.out.println(getName() + " Balık yedi.");
	}

}
