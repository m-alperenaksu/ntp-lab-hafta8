
public class Deneme {

	public static void main(String[] args) {
		Animal a1 = new Animal(8);
		a1.walk();
		a1.eat();
		
		Spider s1 = new Spider();
		s1.eat();

		Cat c1 = new Cat();
		c1.setName("Miskin");
		c1.play();
		c1.eat();
		
		Cat c2 = new Cat("Osman");
		c2.play();
		c2.eat();
		
		Fish f1 = new Fish();
		f1.setName("Maviş");
		f1.play();
		f1.walk();
		f1.eat();
	}

}
