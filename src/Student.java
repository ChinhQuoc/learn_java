import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */

/**
 * @author DELL
 *
 */
public class Student {
	private String name;
	private int studentId;
	private float mathScore;
	private float physisScore;
	private float chemistryScore;
	private float averageScore;
	private String rating;

	public Student() {
		this.averageScore = 0;
		this.rating = "N/A";
	}

	public Student(String name, int studentId, float mathScore, float physisScore, float chemistryScore) {
		this.name = name;
		this.studentId = studentId;
		this.mathScore = mathScore;
		this.physisScore = physisScore;
		this.chemistryScore = chemistryScore;
		this.averageScore = 0;
		this.rating = "N/A";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public float getMathScore() {
		return mathScore;
	}

	public void setMathScore(float mathScore) {
		this.mathScore = mathScore;
	}

	public float getPhysisScore() {
		return physisScore;
	}

	public void setPhysisScore(float physisScore) {
		this.physisScore = physisScore;
	}

	public float getChemistryScore() {
		return chemistryScore;
	}

	public void setChemistryScore(float chemistryScore) {
		this.chemistryScore = chemistryScore;
	}

	public float getAverageScore() {
		return averageScore;
	}

	public void setAverageScore(float averageScore) {
		this.averageScore = averageScore;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Student name: ");
			name = scanner.nextLine();
		} while (isInvalidName(name));

		do {
			System.out.print("Student ID: ");
			studentId = scanner.nextInt();
		} while (isInvalidID(studentId));

		do {
			System.out.print("Math score: ");
			mathScore = scanner.nextFloat();
		} while (isInvalidScore(mathScore));

		do {
			System.out.print("Physis score: ");
			physisScore = scanner.nextFloat();
		} while (isInvalidScore(physisScore));

		do {
			System.out.print("Chemistry score: ");
			chemistryScore = scanner.nextFloat();
		} while (isInvalidScore(chemistryScore));
	}

	public float avegareScore() {
		return (mathScore + physisScore + chemistryScore) / 3;
	}

	public void output(int index) {
		System.out.println(
				" " + index + "\t| " + this.studentId + "\t| " + this.name + "\t| " + formatScore(this.mathScore)
						+ "\t| " + formatScore(this.physisScore) + "\t\t| " + formatScore(this.chemistryScore)
						+ "\t\t| " + formatScore(this.averageScore) + "\t\t| " + this.rating + "\t\t");
	}

	public String studentRating() {
		String result = "";
		float averageScore = avegareScore();

		if (averageScore >= 9) {
			result = "Xuất Sắc";
		} else if (averageScore >= 8) {
			result = "Giỏi";
		} else if (averageScore >= 7) {
			result = "Khá";
		} else if (averageScore >= 6) {
			result = "TB Khá";
		} else if (averageScore >= 5) {
			result = "TB";
		} else {
			result = "Yếu";
		}

		return result;
	}

	public boolean isInvalidName(String name) {
		if (name.isEmpty()) {
			System.err.println("Tên không hợp lệ!");
			return true;
		}

		return false;
	}

	public boolean isInvalidID(int id) {
		if (id < 0) {
			System.err.println("ID invalid!");
			return true;
		}

		return false;
	}

	public boolean isInvalidScore(float score) {
		if (score < 0 || score > 10) {
			System.err.println("Score invalid!");
			return true;
		}

		return false;
	}

	public double formatScore(float number) {
		return Double.parseDouble(new DecimalFormat("#.##").format(number));
	}
}
