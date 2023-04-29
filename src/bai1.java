import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 1
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào một số bất kỳ: ");
		double num = scanner.nextDouble();

		if (num % 5 == 0) {
			System.out.println(num + " chia hết cho 5");
		} else {
			System.out.println(num + " không chia hết cho 5");
		}
	}

}
