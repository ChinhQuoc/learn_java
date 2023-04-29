import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 2
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

		System.out.println("Kết quả: " + max3 + ", " + max2 + ", " + max1);
	}

}
