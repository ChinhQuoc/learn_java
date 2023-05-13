import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 2
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số: ");
		double num = scanner.nextDouble();

		System.out.println(num + " là số " + determineNumber(num));
	}

	public static String determineNumber(double num) {
		return num % 2 == 0 ? " chẵn" : " lẻ";
	}
}
