import java.util.Scanner;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 3
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập lần lượt 3 số nguyên liên tiếp: ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		int max1 = num1;
		int max2 = num2;
		int max3 = num3;

		if (num1 > num2) {
			max1 = num1;
			if (num2 > num3) {
				max2 = num2;
				max3 = num3;
			} else {
				max3 = num2;
				if (num1 > num3) {
					max1 = num1;
					max2 = num3;
				} else {
					max1 = num3;
					max2 = num1;
				}
			}
		} else {
			max1 = num2;
			if (num1 > num3) {
				max2 = num1;
				max3 = num3;
			} else {
				if (num2 > num3) {
					max2 = num3;
					max3 = num1;
				} else {
					max1 = num3;
					max2 = num2;
					max3 = num1;
				}
			}
		}

		System.out.println("Xuất kết quả theo \n1. Xuất kq tăng dần \n2. Xuất kq giảm dần");
		System.out.print("Bạn chọn: ");
		int selection = scanner.nextInt();

		if (selection == 1) {
			System.out.println("Kết quả: " + max3 + ", " + max2 + ", " + max1);
		} else if (selection == 2) {
			System.out.println("Kết quả: " + max1 + ", " + max2 + ", " + max3);
		} else {
			System.out.println("Lựa chọn không hợp lệ");
		}
	}

}
