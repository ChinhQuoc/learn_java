import java.time.Year;
import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 5
		 */
		Scanner scanner = new Scanner(System.in);

		String[] names = new String[3];
		int[] years = new int[3];

		input(names, years, scanner);

		int vitri = findIndexMaxYear(years);
		System.out.println("KQ: sinh viên " + names[vitri] + ", sinh năm " + years[vitri]);
	}

	public static void input(String[] names, int[] years, Scanner scanner) {
		System.out.println("Nhập các thông tin sau: ");
		
		for (int i = 0; i < names.length; i++) {
			int index = i + 1;
			System.out.println("Sinh viên thứ " + index);
			
			do {
				System.out.print("Tên: ");
				names[i] = scanner.nextLine();
			} while (isInvalidName(names[i]));

			do {
				System.out.print("Năm sinh: ");
				years[i] = scanner.nextInt();
				scanner.nextLine();
			} while (isInvalidYear(years[i]));
		}
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
