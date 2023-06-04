import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList studentList = new StudentList();

		selectFeature(studentList);
	}

	public static void selectFeature(StudentList studentList) {
		Scanner scanner = new Scanner(System.in);
		int select = 0;

		do {
			menu();
			System.out.print("Your choice: ");
			select = scanner.nextInt();

			if (select < 1 || select > 8) {
				System.out.println("Invalid selected!\nPlease select again");
			}
		} while (select < 1 || select > 8);

		handleSelected(select, studentList);
	}

	public static void menu() {
		System.out.println("1. Input info students");
		System.out.println("2. Output info students");
		System.out.println("3. Output students with highest average score");
		System.out.println("4. Output students with weak score");
		System.out.println("5. Find students by name");
		System.out.println("6. Find students by ID");
		System.out.println("7. Delete a student by ID");
		System.out.println("8. Exit");
	}

	public static void handleSelected(int selected, StudentList studentList) {
		Scanner scanner = new Scanner(System.in);
		
		switch (selected) {
		case 1: {
			Student student = new Student();

			student.input();
			studentList.addStudent(student);

			student.setAverageScore(student.avegareScore());
			student.setRating(student.studentRating());
			break;
		}
		case 2: {
			studentList.output();
			break;
		}
		case 3: {
			StudentList students = new StudentList();

			students.setStudentList(studentList.findStudentWithHighestAverageScore());
			students.output();
			break;
		}
		case 4: {
			StudentList students = new StudentList();

			students.setStudentList(studentList.findWeakScoreStudent());
			students.output();
			break;
		}
		case 5: {
			StudentList students = new StudentList();

			System.out.print("Input name student yout need to find: ");
			String nameStudent = scanner.nextLine();

			students.setStudentList(studentList.findStudentsByName(nameStudent));
			students.output();
			break;
		}
		case 6: {
			StudentList students = new StudentList();

			System.out.print("Input ID student yout need to find: ");
			int id = scanner.nextInt();

			students.setStudentList(studentList.findStudentsByID(id));
			students.output();
			break;
		}
		case 7: {
			System.out.print("Input ID student yout need to delete: ");
			int id = scanner.nextInt();

			studentList.deleteStudent(id);
			studentList.output();
			break;
		}
		case 8: {
			System.out.println("Exited!");
			System.exit(0);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + selected);
		}

		selectFeature(studentList);
	}
}
