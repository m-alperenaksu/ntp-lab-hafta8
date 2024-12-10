
public class Worker extends Employee {
	private String departman;
	
	Worker(String name, String surName){
		super(name,surName);
		departman = "Bilgi İşlem";
		setJob("Teknisyen");
		setAnnualPermit(10);
		setSalary(45000);
	}

	protected String getDepartman() {
		return departman;
	}

	protected void setDepartman(String departman) {
		this.departman = departman;
	}
	
	public void gender(String c) {
		String cins = c; 
		System.out.println("İşçi cinsiyeti " + cins);
	}

}
