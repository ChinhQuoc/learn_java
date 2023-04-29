import java.util.Scanner;

public class bai4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 4_1
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập số nguyên a: ");
		int a = scanner.nextInt();
		
		System.out.print("Nhập số nguyên b: ");
		int b = scanner.nextInt();
		
		System.out.print("Nhập số nguyên c: ");
		int c = scanner.nextInt();
		
		System.out.print("Nhập số nguyên d: ");
		int d = scanner.nextInt();

		int sum = a + b + c + d;
		int difference = a - b - c - d;
		int product1 = a * b;
		int product2 = c * d;
		int calculator = a - b + c + d;

		System.out.println("a + b + c + d = " + sum);
		System.out.println("a - b - c - d = " + difference);
		System.out.println("a * b = " + product1);
		System.out.println("c * d = " + product2);
		System.out.println("a – b + c + d = " + calculator);
	}

}
