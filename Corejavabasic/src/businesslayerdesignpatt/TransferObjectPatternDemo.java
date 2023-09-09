package businesslayerdesignpatt;

public class TransferObjectPatternDemo {

	public static void main(String[] args) {
		StudentBO studentBusinessObject = new StudentBO();
		//print all students
		for (StudentVO student : studentBusinessObject.getAllStudents()) {
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}//output-Student: [RollNo : 0, Name : Robert ]
		//Student: [RollNo : 1, Name : John ]
		

		////update student
		StudentVO student = studentBusinessObject.getAllStudents().get(0);
		student.setName("Michael");
		studentBusinessObject.updateStudent(student);
		//Student: Roll No 0, updated in the database
		
		//get the student
		student = studentBusinessObject.getStudent(0);
		System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
		}//Student: [RollNo : 0, Name : Michael ]
}
