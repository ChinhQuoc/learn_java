package bai6;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 6
		 */
		final float EXCHANGE_RATE = 23500f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập số tiền USD: ");
		float usd = scanner.nextFloat();
		
		double vnd = usd * EXCHANGE_RATE;
		
		System.out.println("Result: " + vnd);
	}

}
