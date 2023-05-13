import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 4
		 */
		Scanner scanner = new Scanner(System.in);
		int[] arrNums = new int[2];
		arrNums = input(scanner);

		int selection = 0;

		System.out.println("\n1.+ \n2.- \n3.* \n4./");
		selection = select(scanner, selection);

		output(selection, arrNums[0], arrNums[1], scanner);
	}

	public static int[] input(Scanner scanner) {
		int[] arrNums = new int[2];

		do {
			System.out.println("Nhập lần lượt 2 số nguyên khác 0: ");
			arrNums[0] = scanner.nextInt();
			arrNums[1] = scanner.nextInt();

			if (arrNums[0] == 0 || arrNums[1] == 0) {
				System.out.println("Số không hợp lệ!");
			}
		} while (arrNums[0] == 0 || arrNums[1] == 0);

		return arrNums;
	}

	public static int select(Scanner scanner, int selection) {
		do {
			System.out.println("Chọn phép tính mà bạn muốn thực hiện: ");
			selection = scanner.nextInt();

			if (selection < 1 || selection > 4) {
				System.out.println("Không có lựa chọn này!");
			}
		} while (selection < 1 || selection > 4);

		return selection;
	}

	public static void output(int selection, int num1, int num2, Scanner scanner) {
		switch (selection) {
		case 1: {
			System.out.println(num1 + " + " + num2 + " = " + sum(num1, num2));
			break;
		}
		case 2: {
			System.out.println(num1 + " - " + num2 + " = " + subtraction(num1, num2));
			break;
		}
		case 3: {
			System.out.println(num1 + " * " + num2 + " = " + multiplication(num1, num2));
			break;
		}
		case 4: {
			System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}
	}

	public static int sum(int num1, int num2) {
		return num1 + num2;
	}

	public static int subtraction(int num1, int num2) {
		return num1 - num2;
	}

	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}

	public static double division(int num1, int num2) {
		return num1 / (num2 * 1.0);
	}
}
