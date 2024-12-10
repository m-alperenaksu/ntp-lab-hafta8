
public class Engineer extends Employee {

	public Engineer() {
	}
	
	public Engineer(String name, String surName) {
		super(name,surName);
		setJob("Mühendis");
		setSalary(50000);
		setAnnualPermit(10);
	}
	
	public Engineer(String name, String surName, int salary) {
		super(name,surName);
		setSalary(salary);
		if(salary > 50000) {
			setJob("Kıdemli Mühendis");
			setAnnualPermit(15);
		}
	
	}
	
	protected int makeRaise(int artis) {
		int nsalary = getSalary() + artis + 10000;
		return nsalary;
	}
	
	protected void infoBox() {
		System.out.println("Mühendis Adı Soyadı: " + getName() + " " + getSurName());
		System.out.println("Mühendis maaşı: " + getSalary());
		System.out.println("Mühendis yıllık izin: " + getAnnualPermit());
	}
	
	protected void test() {
		super.test(); // Sınavda var. Hangi süper nereden geliyor vs.
		System.out.println("Engineer sınıfı");
	}
	
	public void gender(String c) {
		String cins = c; 
		System.out.println("Mühendis cinsiyeti " + cins);
	}
	
	
}
