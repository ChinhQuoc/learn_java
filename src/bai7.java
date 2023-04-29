import java.util.Scanner;

public class bai7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 7: ax2 + b = 0
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Tính ax2 + b = 0");

		System.out.print("Nhập số a: ");
		double a = scanner.nextDouble();

		if (a == 0) {
			System.err.println("Số không hợp lệ");
			return;
		}

		System.out.print("Nhập số b: ");
		double b = scanner.nextDouble();

		double calculator = -b / a;
		
		if (calculator < 0) {
			System.out.println("Vô nghiệm");
			return;
		}
		
		double result = calculator == 0 ? 0 : Math.sqrt(calculator);
		System.out.println("Tập nghiệm x = " + result);
	}

}
