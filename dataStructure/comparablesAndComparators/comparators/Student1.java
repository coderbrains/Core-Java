package dataStructure.comparablesAndComparators.comparators;

public class Student1 {

	int marks;
	String name;
	
	public Student1(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student1 [marks=" + marks + ", name=" + name + "]";
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}