import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 6: ax + b = 0
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Tính ax + b = 0");

		System.out.print("Nhập số a: ");
		double a = scanner.nextDouble();

		if (a == 0) {
			System.err.println("Số không hợp lệ");
			return;
		}

		System.out.print("Nhập số b: ");
		double b = scanner.nextDouble();

		double result = b == 0 ? 0 : -b / a;
		System.out.println("Tập nghiệm x = " + result);
	}

}
