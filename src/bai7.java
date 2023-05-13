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
		String[] sexs = new String[3];

		input(names, years, sexs, scanner);

		int vitri = findIndexMaxYear(years);
		System.out.println("KQ: cán bộ " + names[vitri] + ", sinh năm " + years[vitri] + ", giới tính " + sexs[vitri]);
	}

	public static void input(String[] names, int[] years, String[] sexs, Scanner scanner) {
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
			} while (isInvalidSex(selected));

			sexs[i] = sexDetermination(selected);
		}
	}

	public static String sexDetermination(int selected) {
		String sex = "";
		switch (selected) {
		case 1: {
			sex = "nam";
			break;
		}
		case 2: {
			sex = "nữ";
			break;
		}
		case 3: {
			sex = "khác";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}

		return sex;
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

	public static boolean isInvalidSex(int selected) {
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
