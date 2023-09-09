package integrationlayerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {
	//list is working as a database
	List<Student> students;
	public StudentDaoImpl(){
		students = new ArrayList<Student>();
		Student student1 = new Student("Robert",0);
		Student student2 = new Student("John",1);
		students.add(student1);
		students.add(student2);
		}
	
	@Override
	public void deleteStudent(Student student) {
		 Student.remove(student.getRollNo());
		System.out.println("Student:Roll No"+student.getRollNo()+",deleted from the database");
		
	}
	//Retrieve list of students from the database
	@Override
	public List<Student> getAllStudents() {
	return students;
	}
	
	
}
