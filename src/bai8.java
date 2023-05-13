import java.util.Scanner;

public class bai8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 8
		 */
		Scanner scanner = new Scanner(System.in);

		float[][] schoolCoordinates = new float[2][1]; // 2 rows, 1 column
		System.out.println("Nhập tọa độ trường học: ");
		schoolCoordinates = inputCoordinates(schoolCoordinates, 0, scanner);

		String[] names = new String[3];
		float[][] coordinates = new float[2][3]; // 2 rows, 3 columns
		input(names, coordinates, scanner);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 1; j++) {
				System.out.println(schoolCoordinates[i][j]);
			}
		}

		double[] distances = new double[3];
		distances = handleDistance(schoolCoordinates, coordinates);

		int index = findIndex(distances);
		System.out.println("sv " + names[index] + " ở xa trường nhất");
	}

	public static float[][] inputCoordinates(float[][] coordinates, int index, Scanner scanner) {
		System.out.print("x = ");
		coordinates[0][index] = scanner.nextFloat();
		scanner.nextLine();

		System.out.print("y = ");
		coordinates[1][index] = scanner.nextFloat();
		scanner.nextLine();

		return coordinates;
	}

	public static void input(String[] names, float[][] coordinates, Scanner scanner) {
		System.out.println("Nhập các thông tin sau: ");

		for (int i = 0; i < names.length; i++) {
			int index = i + 1;
			System.out.println("Sinh viên thứ " + index);

			do {
				System.out.print("Tên: ");
				names[i] = scanner.nextLine();
			} while (isInvalidName(names[i]));

			System.out.println("Tọa độ nhà: ");
			coordinates = inputCoordinates(coordinates, i, scanner);
		}
	}

	public static boolean isInvalidName(String name) {
		if (name.isEmpty()) {
			System.err.println("Tên không hợp lệ!");
			return true;
		}

		return false;
	}

	public static double[] handleDistance(float[][] schoolCoordinates, float[][] coordinates) {
		double[] distances = new double[3];

		for (int i = 0; i < 3; i++) {
			distances[i] = distanceBetweenTwoPoints(schoolCoordinates, coordinates, i);
		}

		return distances;
	}

	public static double distanceBetweenTwoPoints(float[][] schoolCoordinates, float[][] coordinates, int index) {
		return Math.sqrt(Math.pow(coordinates[0][index] - schoolCoordinates[0][0], 2)
				+ Math.pow(coordinates[1][index] - schoolCoordinates[1][0], 2));
	}

	public static int findIndex(double[] arr) {
		double max = arr[0];
		int vitri = 0;

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				vitri = i;
			}
		}

		return vitri;
	}
}
