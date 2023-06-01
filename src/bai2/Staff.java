package bai2;

import java.util.Scanner;

public class Staff extends Officer{
	private String job;
	
	@Override
	public void createOfficer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		super.createOfficer();
		
		System.out.print("Ngành đào tạo: ");
		job = scanner.nextLine();
	}
	
	public Staff() {}
	
	public Staff(String fullName, int age, String gender, String address, String job) {
		super(fullName, age, gender, address);
		this.job = job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
}
