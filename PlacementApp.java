package algoritms.uniPlacement;

import java.util.Collections;
import java.util.List;

import algoritms.uniPlacement.dao.StudentProvider;
import algoritms.uniPlacement.dao.TestImplement;
import algoritms.uniPlacement.dao.UniversityProvider;
import algoritms.uniPlacement.model.Student;
import algoritms.uniPlacement.model.University;

public class PlacementApp {

	static UniversityProvider unProvider = new UniversityProvider();
	static StudentProvider stuProvider=new StudentProvider();
	static TestImplement testProvider=new TestImplement();

	public static void main(String[] args) throws Exception {
		
		// Initialize Student list and student university preferences
		List<Student> studentList = stuProvider.getStudentList();
		
		// defining students test scores
		testProvider.evaluateScore(studentList);

		// placement of students according to their preferences
		toPlaceStudents(studentList);

		System.out.println("");
		studentList.forEach(System.out::println);
	}

	public static void toPlaceStudents(List<Student> studentList) {
		Collections.sort(studentList,
				(s1, s2) -> s1.getScore() > s2.getScore() ? -1 : s1.getScore() == s2.getScore() ? 0 : 1);

		for (int i = 0; i < studentList.size(); i++) {
				Student student = studentList.get(i);
				if(student.isIsplaced()) continue;
				
				String[] pref = student.getPref();
				for (String uniId : pref) {
					University uni = unProvider.getUni(uniId);
					if (uni.hasCapacity()) {
						uni.setStudents(student);
						student.setUname(uni.getName());
						break;
					}			
				}		
		}
		unProvider.getUnis().forEach(System.out::println);
	}


}
