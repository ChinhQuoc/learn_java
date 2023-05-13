import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 3
		 */
		Scanner scanner = new Scanner(System.in);

		double[] arrNum = new double[3];

		System.out.println("Nhập 3 số: ");
		arrNum = input(scanner);

		System.out.println("Tổng 3 số là: " + sum(arrNum));
	}

	public static double[] input(Scanner scanner) {
		double[] arr = new double[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
		}

		return arr;
	}

	public static double sum(double[] arr) {
		double sum = 0;
		for (int index = 0; index < arr.length; index++) {
			sum += arr[index];
		}

		return sum;
	}

}
