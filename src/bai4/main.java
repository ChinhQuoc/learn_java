package bai4;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 4
		 */
		final int X = 5;
		Scanner scanner = new Scanner(System.in);
		
		double result = 0;
		System.out.println("nhập 5 số: ");
		result = scanner.nextDouble();
		result += scanner.nextDouble();
		result += scanner.nextDouble();
		result += scanner.nextDouble();
		result += scanner.nextDouble();
		
		int mean = (int)result / X;
		
		System.out.println("Result: " + mean);
	}

}
