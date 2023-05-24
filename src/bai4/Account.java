/**
 * 
 */
package bai4;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class Account {
	private long accountNumber;
	private String accountName;
	private double amountOutstanding;

	public Account() {
	}

	public Account(long accountNumber, String accountName) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.amountOutstanding = 50;
	}

	public Account(long accountNumber, String accountName, double amount0utstanding) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.amountOutstanding = amount0utstanding;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public double getAmountOutstanding() {
		return amountOutstanding;
	}

	public void setAmountOutstanding(double amountOutstanding) {
		this.amountOutstanding = amountOutstanding;
	}

	public String toString() {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

		return accountNumber + "\t| " + accountName + "\t\t| " + currencyFormat.format(amountOutstanding);
	}

	// nạp tiền vào tài khoản
	public double deposit(double amountDeposit) {
		return amountOutstanding + amountDeposit;
	}

	// rút tiền
	public double withdraw(double amountWithdraw, double withDrawalFee) {
		return amountOutstanding - (amountWithdraw + withDrawalFee);
	}

	// đáo hạn
	public double maturity(double interestRate) {
		return amountOutstanding + (amountOutstanding * interestRate);
	}

	// chuyển khoản
	public double transferMoney(double amountTranfer) {
		return amountOutstanding - amountTranfer;
	}

	public void output() {
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

		System.out
				.println(accountNumber + "\t\t| " + accountName + "\t\t| " + currencyFormat.format(amountOutstanding));
	}
}
