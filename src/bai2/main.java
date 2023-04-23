package bai2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 2: P(x) = ax^n
		 */
		final int X = 8;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập số thực: ");
		float a = scanner.nextFloat();
		
		System.out.println("nhập số nguyên: ");
		int n = scanner.nextInt();
		
		double p = a * Math.pow(X, n);
		System.out.println("Result: " + p);
	}

}
