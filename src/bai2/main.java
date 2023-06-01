package bai2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageOfficer manageOfficer = new ManageOfficer();
		selectFeature(manageOfficer);
	}

	public static void selectFeature(ManageOfficer manageOfficer) {
		Scanner scanner = new Scanner(System.in);
		int select = 0;

		do {
			menu();
			System.out.print("Bạn chọn: ");
			select = scanner.nextInt();

			if (select < 0 || select > 6) {
				System.out.println("Không có lựa chọn này, vui lòng chọn lại");
			}
		} while (select < 0 || select > 6);

		handleSelected(select, manageOfficer);
	}

	public static void handleSelected(int selected, ManageOfficer manageOfficer) {
		switch (selected) {
		case 0: {
			manageOfficer.exit();
			break;
		}
		case 1: {
			// Thêm cán bộ
			Officer officer = new Officer();
			manageOfficer.addOfficer(officer);
			manageOfficer.showListOfficer();
			break;
		}
		case 2: {
			// Thêm kỹ sư
			Officer engineer = new Engineer();
			manageOfficer.addOfficer(engineer);
			manageOfficer.showListOfficer();
			break;
		}
		case 3: {
			// Thêm công nhân
			Officer engineer = new Worker();
			manageOfficer.addOfficer(engineer);
			manageOfficer.showListOfficer();
			break;
		}
		case 4: {
			// Thêm nhân viên
			Officer engineer = new Staff();
			manageOfficer.addOfficer(engineer);
			manageOfficer.showListOfficer();
			break;
		}
		case 5: {
			Scanner scanner = new Scanner(System.in);
			ManageOfficer list = new ManageOfficer();

			System.out.print("Nhập họ tên cán bộ cần tìm: ");
			String officerName = scanner.nextLine();
			list.setList(manageOfficer.findByFullname(officerName));
			list.showListOfficer();
			break;
		}
		case 6: {
			manageOfficer.showListOfficer();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}
		
		selectFeature(manageOfficer);
	}

	public static void menu() {
		System.out.println("0. Thoát");
		System.out.println("1. Thêm cán bộ");
		System.out.println("2. Thêm kỹ sư");
		System.out.println("3. Thêm công nhân");
		System.out.println("4. Thêm nhân viên");
		System.out.println("5. Tìm kiếm theo họ tên");
		System.out.println("6. Hiện thị thông tin về danh sách các cán bộ");
	}
}
