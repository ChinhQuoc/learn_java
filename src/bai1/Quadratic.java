/**
 * 
 */
package bai1;

import java.util.Scanner;

/**
 * @author DELL
 *
 */
public class Quadratic {
	private double a;
	private double b;
	private double c;

	public Quadratic() {
	}

	public Quadratic(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double calculateDelta() {
		return Math.pow(b, 2) - 4 * a * c;
	}

	public void quadraticFormula() {
		double delta = calculateDelta();

		if (delta < 0) {
			System.out.println("No real solution");
		} else if (delta == 0) {
			double x = (-b) / (2 * a);
			System.out.println("x1 = x2 = " + x);
		} else {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("x1 = " + x1 + ", x2 = " + x2);
		}
	}

	public void input() {
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.print("Input a: ");
			a = scanner.nextDouble();

			if (a == 0) {
				System.out.println("Invalid value!");
			}
		} while (a == 0);

		System.out.print("Input b: ");
		b = scanner.nextDouble();

		System.out.print("Input c: ");
		c = scanner.nextDouble();
	}
}
