import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Bai 1
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số thứ nhất: ");
		int m = scanner.nextInt();

		System.out.println("Nhập vào số thứ hai: ");
		int n = scanner.nextInt();

		int max = m;
		if (m < n) {
			max = n;
		}

		System.out.println("Số lớn nhất là: " + max);
	}

}
