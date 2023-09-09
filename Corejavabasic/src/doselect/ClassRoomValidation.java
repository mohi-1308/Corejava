package doselect;

class Student {

	String name;

	int score;

	public Student(String name, int score) {

		this.name = name;

		this.score = score;

	}

}

class Classroom {

	public String registerStudent(Student student) {

		if (!student.name.equals(student.name.toUpperCase())) {

			return "Block letters needed";

		}

		if (student.score < 0 || student.score > 100) {

			return "Invalid score";

		}

		return "Registered";

	}

	public String studentCard(String card) {

		if (!card.matches("\\d+")) {

			return "Invalid card";

		}

		return "Valid card";

	}

}

public class ClassRoomValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Student s1 = new Student("aarav", 6);

		Classroom cm = new Classroom();

		String result = cm.registerStudent(s1);

		System.out.println(result); // Output: Block letters needed
	}

}
