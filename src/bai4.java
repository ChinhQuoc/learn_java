import java.util.Scanner;

public class bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Bai 4
		 */
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số nguyên có hai chữ số: ");
		int num = scanner.nextInt();

		if (num < 10 || num >= 100) {
			System.out.println("Số nhập vào không hợp lệ!");
			return;
		}

		int quotient = (int) num / 10;
		int remainder = num % 10;

		String result = "";

		switch (quotient) {
		case 1: {
			result += "mười";
			break;
		}
		case 2: {
			result += "hai";
			break;
		}
		case 3: {
			result += "ba";
			break;
		}
		case 4: {
			result += "bốn";
			break;
		}
		case 5: {
			result += "năm";
			break;
		}
		case 6: {
			result += "sáu";
			break;
		}
		case 7: {
			result += "bảy";
			break;
		}
		case 8: {
			result += "tám";
			break;
		}
		case 9: {
			result += "chín";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + quotient);
		}

		if (quotient == 1) {
			switch (remainder) {
			case 0: {
				result += "";
				break;
			}
			case 1: {
				result += " một";
				break;
			}
			case 2: {
				result += " hai";
				break;
			}
			case 3: {
				result += " ba";
				break;
			}
			case 4: {
				result += " bốn";
				break;
			}
			case 5: {
				result += " năm";
				break;
			}
			case 6: {
				result += " sáu";
				break;
			}
			case 7: {
				result += " bảy";
				break;
			}
			case 8: {
				result += " tám";
				break;
			}
			case 9: {
				result += " chín";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + remainder);
			}
		} else {
			switch (remainder) {
			case 0: {
				result += " mươi";
				break;
			}
			case 1: {
				result += " mươi mốt";
				break;
			}
			case 2: {
				result += " mươi hai";
				break;
			}
			case 3: {
				result += " mươi ba";
				break;
			}
			case 4: {
				result += " mươi bốn";
				break;
			}
			case 5: {
				result += " mươi lăm";
				break;
			}
			case 6: {
				result += " mươi sáu";
				break;
			}
			case 7: {
				result += " mươi bảy";
				break;
			}
			case 8: {
				result += " mươi tám";
				break;
			}
			case 9: {
				result += " mươi chín";
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + remainder);
			}
		}

		System.out.println(num + " đọc là " + result);
	}

}
