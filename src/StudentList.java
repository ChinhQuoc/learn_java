import java.util.ArrayList;
import java.util.List;

/**
 * 
 */

/**
 * @author DELL
 *
 */
public class StudentList {
	private List<Student> studentList;

	public StudentList() {
		studentList = new ArrayList<Student>();
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	public void addStudent(Student student) {
		studentList.add(student);
	}

	public void output() {
		int index = 0;

		if (studentList.isEmpty()) {
			System.out.println("There are no students!");
		} else {
			System.out.println("\t| ID\t| Name\t| Math\t| Physis\t| Chemistry\t| Average\t| Rating\t");
			for (Student student : studentList) {
				index++;
				student.output(index);
			}
		}

		System.out.println(
				"-----------------------------------------------------------------------------------------------------");
	}

	public List<Student> findStudentWithHighestAverageScore() {
		float max = 0;
		List<Student> highScoreStudents = new ArrayList<Student>();

		for (Student student : studentList) {
			float averageScore = student.getAverageScore();
			if (max < averageScore) {
				highScoreStudents.clear();
				max = averageScore;
				highScoreStudents.add(student);
			} else if (max == averageScore) {
				highScoreStudents.add(student);
			}
		}

		return highScoreStudents;
	}

	public List<Student> findWeakScoreStudent() {
		final String WEAK = "Yếu";
		List<Student> weakScoreStudents = new ArrayList<Student>();

		for (Student student : studentList) {
			if (student.getRating().equals(WEAK)) {
				weakScoreStudents.add(student);
			}
		}

		return weakScoreStudents;
	}

	public List<Student> findStudentsByName(String keyword) {
		List<Student> students = new ArrayList<Student>();

		for (Student student : studentList) {
			if (student.getName().contains(keyword)) {
				students.add(student);
			}
		}

		return students;
	}

	public List<Student> findStudentsByID(int keyword) {
		List<Student> students = new ArrayList<Student>();

		for (Student student : studentList) {
			if (student.getStudentId() == keyword) {
				students.add(student);
			}
		}

		return students;
	}

	public void deleteStudent(int keyword) {
		boolean isExist = false;
		
		for (Student student : studentList) {
			if (student.getStudentId() == keyword) {
				studentList.remove(student);
				isExist = true;
				System.out.println("Delete successful!");
				break;
			}
		}
		
		if (!isExist) {
			System.out.println("Not found!");
		}
	}
	
	public boolean existID(int accountNumber) {
		boolean isExist = false;

		for (Student student : studentList) {
			if (student.getStudentId() == accountNumber) {
				isExist = true;
				break;
			}
		}

		return isExist;
	}
}
