/**
 * 
 */
package bai3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class Student {
	private int id;
	private String fullName;
	private float theoreticalScore;
	private float practiceScore;

	public Student() {}

	public Student(int id, String fullName, float theoreticalScore, float practiceScore) {
		this.id = id;
		this.fullName = fullName;
		this.theoreticalScore = theoreticalScore;
		this.practiceScore = practiceScore;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public float getTheoreticalScore() {
		return theoreticalScore;
	}

	public void setTheoreticalScore(float theoreticalScore) {
		this.theoreticalScore = theoreticalScore;
	}

	public float getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(float practiceScore) {
		this.practiceScore = practiceScore;
	}

	public float avegareScore() {
		return (theoreticalScore + practiceScore) / 2;
	}

	public String toString() {
		return id + "\t| " + fullName + "\t\t| " + formatScore(theoreticalScore) + "\t\t\t| "
				+ formatScore(practiceScore);
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Student ID: ");
			setId(scanner.nextInt());
			scanner.nextLine();
		} while (isInvalidID(id));

		do {
			System.out.print("Student full name: ");
			setFullName(scanner.nextLine());
		} while (isInvalidName(fullName));

		do {
			System.out.print("Theoretical score: ");
			setTheoreticalScore(scanner.nextFloat());
		} while (isInvalidScore(theoreticalScore));

		do {
			System.out.print("practiceScore score: ");
			setPracticeScore(scanner.nextFloat());
		} while (isInvalidScore(practiceScore));
	}

	public boolean isInvalidID(int id) {
		if (id < 0) {
			System.err.println("ID invalid!");
			return true;
		}

		return false;
	}

	public boolean isInvalidName(String name) {
		if (name.isEmpty()) {
			System.err.println("Tên không hợp lệ!");
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
