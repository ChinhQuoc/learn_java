import java.time.Year;
import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 7
		 */
		Scanner scanner = new Scanner(System.in);

		String[] names = new String[3];
		int[] years = new int[3];
		String[] genders = new String[3];

		input(names, years, genders, scanner);

		int vitri = findIndexMaxYear(years);
		System.out.println("KQ: cán bộ " + names[vitri] + ", sinh năm " + years[vitri] + ", giới tính " + genders[vitri]);
	}

	public static void input(String[] names, int[] years, String[] genders, Scanner scanner) {
		System.out.println("Nhập các thông tin sau: ");

		for (int i = 0; i < names.length; i++) {
			int index = i + 1;
			System.out.println("Cán bộ thứ " + index);
			
			do {
				System.out.print("Tên: ");
				names[i] = scanner.nextLine();
			} while (isInvalidName(names[i]));

			do {
				System.out.print("Năm sinh: ");
				years[i] = scanner.nextInt();
				scanner.nextLine();
			} while (isInvalidYear(years[i]));

			System.out.println("\n1.nam \n2.nữ \n3.khác");
			int selected = 0;

			do {
				System.out.print("Giới tính: ");
				selected = scanner.nextInt();
				scanner.nextLine();
			} while (isInvalidGender(selected));

			genders[i] = genderDetermination(selected);
		}
	}

	public static String genderDetermination(int selected) {
		String gender = "";
		switch (selected) {
		case 1: {
			gender = "nam";
			break;
		}
		case 2: {
			gender = "nữ";
			break;
		}
		case 3: {
			gender = "khác";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}

		return gender;
	}

	public static boolean isInvalidName(String name) {
		if (name.isEmpty()) {
			System.err.println("Tên không hợp lệ!");
			return true;
		}

		return false;
	}

	public static boolean isInvalidYear(int year) {
		int curentYear = Year.now().getValue();
		if (year < 1900 || year > curentYear) {
			System.err.println("Năm sinh không hợp lệ!");
			return true;
		}

		return false;
	}

	public static boolean isInvalidGender(int selected) {
		if (selected < 1 || selected > 3) {
			System.err.println("Lựa chọn không hợp lệ!");
			return true;
		}

		return false;
	}

	public static int findIndexMaxYear(int[] years) {
		int max = years[0];
		int vitri = 0;

		for (int i = 0; i < years.length; i++) {
			if (max < years[i]) {
				vitri = i;
			}
		}

		return vitri;
	}
}
