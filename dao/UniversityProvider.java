package algoritms.uniPlacement.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import algoritms.uniPlacement.model.University;

public class UniversityProvider {
	
	private Map<String,University> universityMap=new HashMap();
	
	public UniversityProvider() {
		List<University> unis = new ArrayList<>();
		unis.add(new University("IST", "Istanbul Unv", 5));
		unis.add(new University("ANK", "Ankara Unv", 4));
		unis.add(new University("EGE", "Ege Unv", 3));
		
		for (University university : unis) {
			universityMap.put(university.getId(),university);
		}
	}

	public Collection<University> getUnis() {
		return universityMap.values();
	}
	
	public University getUni(String id) {
		return universityMap.get(id);
	}
	
}
