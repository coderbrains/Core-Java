package dataStructure.comparablesAndComparators.comparables;

public class Student implements Comparable<Student>  {
	
	int marks;
	String name;
	public Student(int marks, String name) {
		super();
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
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

	@Override
	public int compareTo(Student o) {
		int a =  this.marks - o.marks;
		if(a == 0) {
			return this.name.compareTo(o.name);
		}else {
			return a;
		}
		
	}
	
	

}
