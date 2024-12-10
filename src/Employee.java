
public class Employee {
	private String name, surName, job;
	private int salary, annualPermit;
	
	public Employee() {} // Eğer diğer tipteki constructoları oluşturmasaydık, bu otomatik oluşurdu. Ama şimdi tanımlamak zorundayız.
	
	public Employee(String name, String surName) {
		this.name = name;
		this.surName = surName;
		job = "Çalışan";
		salary = 30000;
		annualPermit = 10;
	}
	
	public Employee(String name, String surName, int salary) {
		this.name = name;
		this.surName = surName;
		if(salary > 30000) {
			job = "Kıdemli Çalışan";
			annualPermit += 5;
		} 
		this.salary = salary;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSurName() {
		return surName;
	}

	protected void setSurName(String surName) {
		this.surName = surName;
	}

	protected String getJob() {
		return job;
	}

	protected void setJob(String job) {
		this.job = job;
	}

	protected int getSalary() {
		return salary;
	}

	protected void setSalary(int salary) {
		this.salary = salary;
	}

	protected int getAnnualPermit() {
		return annualPermit;
	}

	protected void setAnnualPermit(int annualPermit) {
		this.annualPermit = annualPermit;
	}
	
	protected int MakeRaise(int artis) {
		int nsalary = salary + artis;
		return nsalary;
	}
	
	protected void infoBox() {
		System.out.println("Çalışan adı soyadı: " + getName() + " " + getSurName());
		System.out.println("Çalışan maaş : " + getSalary());
		System.out.println("Çalışan yıllık izin: " + getAnnualPermit());
	}
	
	protected void test() {
		System.out.println("Employee sınıfı");
	}
	
}
