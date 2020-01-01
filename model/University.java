package algoritms.uniPlacement.model;

import java.util.ArrayList;
import java.util.List;

public class University {
	
	private String id;
	private String name;
	private int capacity;
	private List<Student> students;
	
	public University() {}
	
	public University(String id, String name, int capacity) {
		this.id = id;
		this.name = name;
		this.capacity = capacity;
		this.students =new ArrayList<>();
	}
	
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(Student s) {
		
		this.students.add(s);
	} 
	
	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		String studentList="";
		for (Student student : students) {
			studentList+="\n"+student.getName()+"-"+student.getScore()+" "+student.getPrefPretty();
		}
		
		return "University [id=" + id + ", name=" + name + ", capacity=" + capacity + ", students=" + studentList + "]";
	}

	public boolean hasCapacity() {
		return students.size()<capacity;
	}

	
	
	
	
}
