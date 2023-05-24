/**
 * 
 */
package bai4;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accounts accounts = new Accounts();

		selectFeature(accounts);
	}

	public static void selectFeature(Accounts accounts) {
		Scanner scanner = new Scanner(System.in);
		int select = 0;

		do {
			menu();
			System.out.print("Bạn chọn: ");
			select = scanner.nextInt();

			if (select < 1 || select > 7) {
				System.out.println("Lựa chọn không hợp lệ!. Vui lòng chọn lại.");
			}
		} while (select < 1 || select > 7);

		handleSelected(select, accounts);
	}

	public static void handleSelected(int selected, Accounts accounts) {
		Scanner scanner = new Scanner(System.in);

		switch (selected) {
		case 1: {
			Account account = createAccount(accounts);
			accounts.addAcount(account);
			break;
		}
		case 2: {
			accounts.output();
			break;
		}
		case 3: {
			accounts.handleDeposit();
			break;
		}
		case 4: {
			accounts.handleWithdrawMoney();
			break;
		}
		case 5: {
			accounts.handleMaturity();
			break;
		}
		case 6: {
			accounts.handleTransferMoney();
			break;
		}
		case 7: {
			System.out.println("Kết thúc!");
			System.exit(0);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}

		selectFeature(accounts);
	}

	public static void menu() {
		System.out.println("1. Nhập thông tin tài khoản");
		System.out.println("2. Xuất thông tin các tài khoản");
		System.out.println("3. Nạp tiền");
		System.out.println("4. Rút tiền");
		System.out.println("5. Đáo hạn");
		System.out.println("6. Chuyển khoản");
		System.out.println("7. Thoát");
	}

	public static Account createAccount(Accounts accounts) {
		Scanner scanner = new Scanner(System.in);
		long accountNumber = 0;
		String accountName = "";

		do {
			System.out.print("Số tài khoản: ");
			accountNumber = scanner.nextLong();
			scanner.nextLine();
		} while (isInvalidAccountNumber(accountNumber, accounts));

		do {
			System.out.print("Tên tài khoản: ");
			accountName = scanner.nextLine();
		} while (isInvalidAccountName(accountName));

		return new Account(accountNumber, accountName);
	}

	public static boolean isInvalidAccountNumber(long accountNumber, Accounts accounts) {
		if (accountNumber < 100000 || accounts.existAccount(accountNumber)) {
			System.err.println("Số tài khoản không hợp lệ!");
			return true;
		}

		return false;
	}

	public static boolean isInvalidAccountName(String name) {
		if (name.isEmpty()) {
			System.err.println("Tên tài khoản không hợp lệ!");
			return true;
		}

		return false;
	}
}
