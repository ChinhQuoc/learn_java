package bai2;

import java.util.Scanner;

public class Worker extends Officer{
	private int level;
	
	@Override
	public void createOfficer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		super.createOfficer();
		
		System.out.print("Cấp bậc: ");
		level = scanner.nextInt();
	}
	
	public Worker() {}
	
	public Worker(String fullName, int age, String gender, String address, int level) {
		super(fullName, age, gender, address);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
