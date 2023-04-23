package bai1;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 1
		 */
		final int SQUARE = 2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("nhập chiều dài cạnh góc vuông thứ nhất: ");
		float rightAngle1 = scanner.nextFloat();
		
		System.out.println("nhập chiều dài cạnh góc vuông thứ hai: ");
		float rightAngle2 = scanner.nextFloat();
		
		double hypotenuse = Math.sqrt(Math.pow(rightAngle1, SQUARE) + Math.pow(rightAngle2, SQUARE));
		
		System.out.println("Result: " + hypotenuse);
	}

}
