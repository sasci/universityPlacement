package algoritms.uniPlacement.dao;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import algoritms.uniPlacement.model.Student;
import algoritms.uniPlacement.model.Test;

public class TestImplement {
	
	private Map<String,Test> testMap = new HashMap();
	
	public TestImplement() {
		List<Test> test = new ArrayList<>();
		try (Scanner s = new Scanner(new FileReader("unsorted.txt"))) {
			while (s.hasNext()) {
				Test t = new Test();
				t.setId(s.next());
				t.setKeyNumeric(s.next());
				t.setKeySocial(s.next());
				test.add(t);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		for (Test t : test) {
			testMap.put(t.getId(), t);
		}
	}
	
	public Collection<Test> getTests() {
		return testMap.values();
	}

	public Test getTest(String id) {
		return testMap.get(id);
	}

	public void evaluateScore(List<Student> s) {
		int score = 0;
		for (int j = 0; j < s.size(); j++) {
			Student student = s.get(j);
			String keys = this.getTest("OSYS").mergeKey();
			String studentAnswers = this.getTest(s.get(j).getId()).mergeKey();
			for (int i = 0; i < keys.length(); i++) {
				if (keys.charAt(i) == studentAnswers.charAt(i)) {
					if (i < 30)
						score += 3;
					else if (i < 50)
						score += 2;
					else
						score += 1;
				}
			}
			student.setScore(score);
			score = 0;
		}
	}
}
