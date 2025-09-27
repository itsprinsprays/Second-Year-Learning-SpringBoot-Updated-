package SpringBootJDBC.model;

public class Animal {
	
	private String name, type;
	private int ID;
	
	public Animal(String name, String type, int ID) {
		this.name = name;
		this.type = type;
		this.ID = ID;
	}
	
	public String getName() { return name; }
	public String getType() { return type; }
	public int getID() { return ID; }
	
	public void setName(String name) { this.name = name; }
	public void setType(String type) { this.type = type; }
	public void setID(int ID) { this.ID = ID; }

}
