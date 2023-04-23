package bai5;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 5
		 */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập độ C: ");
		float c = scanner.nextFloat();
		
		double f = (c * 1.8) + 32;
		
		System.out.println("Result: " + f);
	}

}
