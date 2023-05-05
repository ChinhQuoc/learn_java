import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 2
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập các thông tin sau");

		System.out.print("Họ tên: ");
		String fullName = scanner.nextLine();

		if (fullName.isEmpty()) {
			System.err.println("Tên không hợp lệ!");
			return;
		}

		System.out.print("Tuổi: ");
		int age = scanner.nextInt();
		scanner.nextLine(); // skip the newline character

		if (age < 0) {
			System.err.println("Tuổi không hợp lệ!");
			return;
		}

		System.out.println("Giới tính \n0. Nam \n1. Nữ \n2. khác ");
		System.out.print("Bạn chọn: ");
		int sex = scanner.nextInt();
		scanner.nextLine(); // skip the newline character

		if (sex < 0 || sex > 2) {
			System.err.println("Lựa chọn không hợp lệ!");
			return;
		}

		System.out.print("Mã số sv: ");
		String studentId = scanner.nextLine();

		if (studentId.isEmpty()) {
			System.err.println("MSSV không hợp lệ!");
			return;
		}

		System.out.println("Họ tên: " + fullName + "\nTuổi: " + age + "\nGiới tính: " + sex + "\nMSSV: " + studentId);
	}

}
