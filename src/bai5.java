import java.util.Scanner;

public class bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 5
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("You are: \nB. Dad \nH. Mom \nA. brother \nE. sister");
		System.out.println("Select one: ");
		char selection = scanner.next().charAt(0);

		switch (selection) {
		case 'B': 
		case 'H':{
			System.out.println("Hello there darling and my babies!");
			break;
		}
		case 'A': {
			System.out.println("Hi daddy, mommy and my sister!");
			break;
		}
		case 'E': {
			System.out.println("Hi daddy, mommy and my brother!");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selection);
		}
	}

}
