import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 1
		 */
		Scanner scanner = new Scanner(System.in);

		double[] arr = new double[3];
		System.out.println("Nhập lần lượt 3 số: ");
		arr = input(scanner);

		System.out.println("max = " + findMaxNumber(arr));
	}

	public static double[] input(Scanner scanner) {
		double[] arr = new double[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextDouble();
		}

		return arr;
	}

	public static double findMaxNumber(double[] arr) {
		double max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		return max;
	}
}
