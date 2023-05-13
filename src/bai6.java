import java.util.Scanner;

public class bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 6
		 */
		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[3];

		System.out.println("Nhập lần lượt 3 số nguyên");
		arr = input(scanner);

		findQuantity(arr, scanner);
	}
	
	public static int[] input(Scanner scanner) {
		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		return arr;
	}

	public static void findQuantity(int[] arr, Scanner scanner) {
		int quantityOfOddNumber = 0;
		int quantityOfEvenNumber = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				quantityOfEvenNumber++;
			} else {
				quantityOfOddNumber++;
			}
		}

		System.out.println("Có " + quantityOfEvenNumber + " số chẵn và " + quantityOfOddNumber + " số lẻ");
	}

}
