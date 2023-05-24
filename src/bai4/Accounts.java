/**
 * 
 */
package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class Accounts {
	Scanner scanner = new Scanner(System.in);
	private List<Account> accountList;

	public Accounts() {
		accountList = new ArrayList<Account>();
	}

	public void addAcount(Account account) {
		accountList.add(account);
	}

	public boolean existAccount(long accountNumber) {
		boolean isExist = false;

		for (Account account : accountList) {
			if (account.getAccountNumber() == accountNumber) {
				isExist = true;
				break;
			}
		}

		return isExist;
	}

	public void output() {
		int index = 0;

		if (accountList.isEmpty()) {
			System.out.println("Không có tài khoản nào!");
		} else {
			title();
			for (Account account : accountList) {
				index++;
				account.output();
			}
		}

		System.out.println("--------------------------------------------------------------------------");
	}

	// xử lý nạp tiền
	public void handleDeposit() {
		Account account = new Account();
		long accountNumber = 0;
		double amount = 0;

		// input and check condition
		do {
			System.out.println("Nhập số tài khoản của bạn: ");
			accountNumber = scanner.nextLong();
			account = findAccountNumber(accountNumber);
		} while (isInnvalidAccount(account));

		do {
			System.out.println("Nhập số tiền cần nạp: ");
			amount = scanner.nextDouble();

			if (amount <= 0) {
				System.out.println("Số tiền không hợp lệ!");
			}
		} while (amount <= 0);

		// handle
		account.setAmountOutstanding(account.deposit(amount));

		// output
		title();
		account.output();
	}

	// xử lý rút tiền
	public void handleWithdrawMoney() {
		final double feeWithdraw = 0.03;
		Account account = new Account();
		long accountNumber = 0;
		double amount = 0;
		boolean invalidConditionWithdraw = false;

		// input and check condition
		do {
			System.out.println("Nhập số tài khoản của bạn: ");
			accountNumber = scanner.nextLong();
			account = findAccountNumber(accountNumber);
		} while (isInnvalidAccount(account));

		do {
			System.out.println("Nhập số tiền cần rút: ");
			amount = scanner.nextDouble();

			double fee = amount + feeWithdraw;
			invalidConditionWithdraw = amount <= 0 && account.getAmountOutstanding() >= fee;

			if (invalidConditionWithdraw) {
				System.out.println("Số tiền không hợp lệ!");
			}
		} while (invalidConditionWithdraw);

		// handle
		account.setAmountOutstanding(account.withdraw(amount, feeWithdraw));

		// output
		title();
		account.output();
	}

	// xử lý đáo hạn
	public void handleMaturity() {
		final float INTEREST_RATE = 0.035f;
		Account account = new Account();
		long accountNumber = 0;

		// input and check condition
		do {
			System.out.println("Nhập số tài khoản cần đáo hạn: ");
			accountNumber = scanner.nextLong();
			account = findAccountNumber(accountNumber);
		} while (isInnvalidAccount(account));

		// handle
		account.setAmountOutstanding(account.maturity(INTEREST_RATE));

		// output
		title();
		account.output();
	}

	// xử lý chuyển khoản
	public void handleTransferMoney() {
		Account yourAccount = new Account();
		Account clientAccount = new Account();
		double amount = 0;

		// input and check condition
		do {
			System.out.println("Nhập số tài khoản của bạn: ");
			long accountNumber = scanner.nextLong();
			yourAccount = findAccountNumber(accountNumber);
		} while (isInnvalidAccount(yourAccount));

		do {
			System.out.println("Nhập số tài khoản cần chuyển: ");
			long accountNumber = scanner.nextLong();
			clientAccount = findAccountNumber(accountNumber);
		} while (isInnvalidAccount(clientAccount));

		do {
			System.out.println("Nhập số tiền cần chuyển: ");
			amount = scanner.nextDouble();

			if (amount <= 0 || amount > yourAccount.getAmountOutstanding()) {
				System.out.println("Số tiền không hợp lệ!");
			}
		} while (amount <= 0 || amount > yourAccount.getAmountOutstanding());

		// handle
		yourAccount.setAmountOutstanding(yourAccount.transferMoney(amount));
		clientAccount.setAmountOutstanding(clientAccount.deposit(amount));

		// output
		title();
		yourAccount.output();
		clientAccount.output();
	}

	public Account findAccountNumber(long keyword) {
		Account accountBeFount = new Account();

		for (Account account : accountList) {
			if (account.getAccountNumber() == keyword) {
				accountBeFount = account;
				break;
			}
		}

		return accountBeFount;
	}

	public boolean isInnvalidAccount(Account account) {
		if (account.getAccountNumber() == 0) {
			System.out.println("Số tài khoản không có trên hệ thống!");
			return true;
		}

		return false;
	}

	public void title() {
		System.out.println(" Số tài khoản\t| Tên tài khoản\t| Số tiền");
	}

	public List<Account> getAccountList() {
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
}
