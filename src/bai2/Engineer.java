package bai2;

import java.util.Scanner;

public class Engineer extends Officer{
	private String trainingIndustry;
	
	@Override
	public void createOfficer() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		super.createOfficer();
		
		System.out.print("Ngành đào tạo: ");
		trainingIndustry = scanner.nextLine();
	}
	
	public Engineer() {
		
	}

	public Engineer(String fullName, int age, String gender, String address, String trainingIndustry) {
		super(fullName, age, gender, address);
		this.trainingIndustry = trainingIndustry;
	}
	
	public String getTrainingIndustry() {
		return trainingIndustry;
	}

	public void setTrainingIndustry(String trainingIndustry) {
		this.trainingIndustry = trainingIndustry;
	}
	
}
