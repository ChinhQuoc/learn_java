import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 5
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Hãy chọn tiếng kêu các con vật sau \n1. chó \n2. mèo \n3. chuột \n4. ngựa");
		System.out.print("Bạn chọn: ");
		int selection = scanner.nextInt();

		if (selection < 1 || selection > 4) {
			System.out.println("Lựa chọn không hợp lệ!");
			return;
		}

		switch (selection) {
		case 1: {
			System.out.println("gâu gâu...");
			break;
		}
		case 2: {
			System.out.println("meo meo...");
			break;
		}
		case 3: {
			System.out.println("chít chít...");
			break;
		}
		case 4: {
			System.out.println("brừ brừ...");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}
	}

}
