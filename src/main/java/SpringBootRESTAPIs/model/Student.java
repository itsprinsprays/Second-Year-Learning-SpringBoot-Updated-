package SpringBootRESTAPIs.model;

public class Student {
	
	private String name, section;
	private int age;
	private Long id;
	
	public Student(String name, String section, int age,Long id) {
		this.name = name;
		this.section = section;
		this.age = age;
		this.id = id;
	}
	
	public String getName() { return name; }
	public String getSection() { return section; }
	public int getAge() { return age; }
	public Long getID() { return id; }
}
