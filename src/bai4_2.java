import java.util.Scanner;

public class bai4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 4_2
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.print("nhập số nguyên: ");
		int num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " là số chẵn");
		} else {
			System.out.println(num + " là số lẻ");
		}
	}

}
