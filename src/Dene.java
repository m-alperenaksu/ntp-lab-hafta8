
public class Dene {

	public static void main(String[] args) {
		Employee e1 = new Employee("Ahmet", "Mehmet");
		//e1.infoBox();
		
		Employee e2 = new Employee("Hasan", "Hüseyin", 40000);
		//e2.infoBox();
		//System.out.println("Yeni maaş = " + e2.MakeRaise(10000));
		//e2.infoBox();
		
		Engineer en1 = new Engineer();
		en1.setName("Ali");
		en1.setSurName("Veli");
		en1.setJob("Baş Mühendis");
		en1.setAnnualPermit(30);
		en1.setSalary(100000);
		//en1.infoBox();
		en1.test();
		
		Employee e3 = new Engineer("Yusuf","Yıldız",65000);
		e3.infoBox();
	}

}
