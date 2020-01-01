package algoritms.uniPlacement.model;

public class Test {
	private String id;
	private String keyNumeric;
	private String keySocial;
	
	public Test() {}
	
	public Test(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKeyNumeric() {
		return keyNumeric;
	}

	public void setKeyNumeric(String keyNumeric) {
		this.keyNumeric = keyNumeric;
	}

	public String getKeySocial() {
		return keySocial;
	}

	public void setKeySocial(String keySocial) {
		this.keySocial = keySocial;
	}
	
	public String mergeKey() {
		return this.getKeyNumeric()+this.getKeySocial();
	}

	@Override
	public String toString() {
		return "Test [id=" + id + ", keyNumeric=" + keyNumeric + ", keySocial=" + keySocial + "]";
	}
	
	
	
}
