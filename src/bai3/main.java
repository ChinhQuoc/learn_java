package bai3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admissions admissions = new Admissions();
		selectFeature(admissions);
	}

	public static void selectFeature(Admissions admissions) {
		Scanner scanner = new Scanner(System.in);
		int select = 0;

		do {
			menu();
			System.out.print("Bạn chọn: ");
			select = scanner.nextInt();

			if (select < 0 || select > 3) {
				System.out.println("Không có lựa chọn này, vui lòng chọn lại");
			}
		} while (select < 0 || select > 3);

		handleSelected(select, admissions);
	}

	public static void handleSelected(int selected, Admissions admissions) {
		switch (selected) {
		case 0: {
			admissions.exit();
			break;
		}
		case 1: {
			Candidate candidate = new Candidate();
			admissions.addNewCandidate(candidate, admissions);
			admissions.output();
			break;
		}
		case 2: {
			admissions.output();
			break;
		}
		case 3: {
			Scanner scanner = new Scanner(System.in);
			Admissions result = new Admissions();
			
			System.out.print("Nhập số báo danh của thí sinh cần tìm: ");
			String regisTrationNumber = scanner.nextLine();
			result.setList(admissions.findByRegisTrationNumber(regisTrationNumber));
			result.output();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}
		
		selectFeature(admissions);
	}

	public static void menu() {
		System.out.println("0. Thoát");
		System.out.println("1. Thêm thí sinh");
		System.out.println("2. Hiển thị thông tin");
		System.out.println("3. Tìm kiếm theo số báo danh");
	}
}
