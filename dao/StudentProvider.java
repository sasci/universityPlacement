package algoritms.uniPlacement.dao;

import java.util.ArrayList;
import java.util.List;

import algoritms.uniPlacement.model.Student;

public class StudentProvider {
	private List<Student> studentList = new ArrayList<>();

	public StudentProvider() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("s1", "Ahmet", "ANK", "IST", "EGE"));
		studentList.add(new Student("s2", "Mehmet", "IST", "ANK", "EGE"));
		studentList.add(new Student("s3", "Ayse", "ANK", "EGE", "IST"));
		studentList.add(new Student("s4", "Akif", "ANK", "IST", "EGE"));
		studentList.add(new Student("s5", "Ahsen", "ANK", "EGE", "IST"));
		studentList.add(new Student("s6", "Harun", "IST", "EGE", "ANK"));
		studentList.add(new Student("s7", "Esra", "EGE", "ANK", "IST"));
		studentList.add(new Student("s8", "Ersin", "ANK", "IST", "EGE"));
		studentList.add(new Student("s9", "Metin", "EGE", "IST", "ANK"));
		studentList.add(new Student("s10", "Sinan", "IST", "ANK", "EGE"));
		this.studentList = studentList;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

}
