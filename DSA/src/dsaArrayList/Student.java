package dsaArrayList;

public class Student {
	private int id;
	private String name;
	private int regNo;
	
	Student(int id, String name, int reg){
		this.id = id;
		this.name = name;
		this.regNo = reg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", regNo=" + regNo + "]";
	}
	
	
}
