/**
 * 
 */
package bai3;

/**
 * @author DELL
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(123, "Dam Thi Hiep", 9, 9);
		Student student2 = new Student(215, "Amandor Luis", 9, 8);
		Student student3 = new Student();
		student3.input();

		System.out.println("ID\t| Full Name\t\t| Theoretical Score\t| Practice Score\t");
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println("---------------------------------------------------------------------------------");
	}
}
