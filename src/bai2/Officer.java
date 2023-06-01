package bai2;

import java.util.Scanner;

public class Officer {
	private String fullName;
	private int age;
	private String gender;
	private String address;

	public void createOfficer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập các thông tin sau");

		do {
			System.out.print("Họ tên: ");
			fullName = scanner.nextLine();
		} while (isInvalidString(fullName, "Họ tên"));
		

		do {
			System.out.print("Tuổi: ");
			age = scanner.nextInt();
			scanner.nextLine();
		} while (isInvalidAge(age));
		
		do {
			System.out.println("Giới tính nam, nữ, khác");
			System.out.print("Giới tính: ");
			gender = scanner.nextLine().toLowerCase();
		} while (isInvalidGender(gender));
		
		do {
			System.out.print("Địa chỉ: ");
			address = scanner.nextLine();
		} while (isInvalidString(address, "Địa chỉ"));
	}

	public void output(int index) {
		// instanceof: dùng để ktra phương thức khởi tạo của biến là gì
		System.out.println(" " + index + "\t| " + fullName + "\t| " + age + "\t| " + gender + "\t| " + address);
	}
	
	public boolean isInvalidString(String value, String atribute) {
		if (value.isEmpty()) {
			System.err.println(atribute + " không hợp lệ!");
			return true;
		}

		return false;
	}

	public boolean isInvalidAge(int age) {
		if (age <= 18 || age >= 200) {
			System.err.println("Tuổi không hợp lệ!");
			return true;
		}

		return false;
	}
	
	public boolean isInvalidGender(String gender) {
		if (!gender.equals("nam") && !gender.equals("nữ") && !gender.equals("khác")) {
			System.err.println("Giới tính không hợp lệ!");
			return true;
		}

		return false;
	}
	
	public Officer() {
	}

	public Officer(String fullName, int age, String gender, String address) {
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
