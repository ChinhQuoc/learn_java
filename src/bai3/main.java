package bai3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 3
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập số: ");
		int inputNumber = scanner.nextInt();
		
		int quotient = (int) inputNumber / 10;
		int remainder = inputNumber % 10;
		
		int result = quotient + remainder;
		
		System.out.println("Reult: " + result);
	}

}
