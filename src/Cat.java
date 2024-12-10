
public class Cat extends Animal implements Pet {
	private String name;
	
	public Cat() {
		super(4);
	}
	
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void play() {
		System.out.println(getName() + " Kedi oynadı.");
		
	}
	
	public void eat() {
		System.out.println(getName() + " Kedi yedi");
	}
	
	

}
