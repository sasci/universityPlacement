package algoritms.uniPlacement.model;

import java.util.Arrays;

public class Student {
	private String id;
	private String name;
	private int score;
	private String[] pref = new String[3];
	private String uname;
	private boolean isplaced;

	public Student(String id, String name) {
		this.id = id;
		this.name = name;
		this.score = 0;
	}
	
	public Student(String id, String name,String... prefs) {
		this.id = id;
		this.name = name;
		this.score = 0;
		this.isplaced = false;
		this.pref=prefs;
	}

	
	public boolean isIsplaced() {
		return isplaced;
	}

	public void setIsplaced(boolean isplaced) {
		this.isplaced = isplaced;
	}

	public String[] getPref() {
		return pref;
	}

	public String getPref(int index) {
		return this.pref[index];
	}

	public void setPref(String[] pref) {
		this.pref = pref;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
		this.setIsplaced(true);
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


	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", pref=" + Arrays.toString(pref)
				+ ", uname=" + uname + "]";
	}

	public String getPrefPretty() {
		String result = "";
		for (String string : pref) {
			result += string + ",";
		}
		return result;
	}

}
