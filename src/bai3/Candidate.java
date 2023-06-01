package bai3;

import java.util.Scanner;

public class Candidate {
	private String regisTrationNumber;
	private String fullName;
	private String address;
	private String priorityLevel;
	private String examBlock;

	public Candidate() {
	}

	public void addNewCandidate(Admissions admissions) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập các thông tin sau");

		do {
			System.out.print("Số báo danh: ");
			regisTrationNumber = scanner.nextLine();
		} while (isInvalidRegisTrationNumber(regisTrationNumber, admissions));

		do {
			System.out.print("Họ tên: ");
			fullName = scanner.nextLine();
		} while (isInvalidString(fullName, "Họ tên"));

		do {
			System.out.print("Địa chỉ: ");
			address = scanner.nextLine();
		} while (isInvalidString(address, "Địa chỉ"));

		do {
			System.out.print("Mức ưu tiên: ");
			priorityLevel = scanner.nextLine();
		} while (isInvalidString(priorityLevel, "Mức ưu tiên"));

		do {
			System.out.print("Khối thi: ");
			examBlock = scanner.nextLine();
		} while (isInvalidString(examBlock, "Khối thi"));
	}

	public void output(int index) {
		System.out.println(" " + index + "\t| " + regisTrationNumber + "    | " + fullName + "\t\t| " + priorityLevel
				+ "\t     | " + examBlock + "\t| " + address);
	}
	
	public boolean isInvalidRegisTrationNumber(String keyword, Admissions admissions) {
		if (keyword.isEmpty() || admissions.existRegisTrationNumber(keyword)) {
			System.err.println("Số báo danh không hợp lệ!");
			return true;
		}

		return false;
	}

	public boolean isInvalidString(String value, String atribute) {
		if (value.isEmpty()) {
			System.err.println(atribute + " không hợp lệ!");
			return true;
		}

		return false;
	}

	public String getRegisTrationNumber() {
		return regisTrationNumber;
	}

	public void setRegisTrationNumber(String regisTrationNumber) {
		this.regisTrationNumber = regisTrationNumber;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPriorityLevel() {
		return priorityLevel;
	}

	public void setPriorityLevel(String priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public String getExamBlock() {
		return examBlock;
	}

	public void setExamBlock(String examBlock) {
		this.examBlock = examBlock;
	}
}
