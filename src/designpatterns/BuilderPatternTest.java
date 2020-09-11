package designpatterns;

class Student{
	
	int id;
	String name;
	String type;
	
	public Student(Builder builder) {
		this.id=builder.id;
		this.name=builder.name;
		this.type=builder.type;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", type=" + type + "]";
	}
	
	
}
class Builder{
	
	int id;
	String name;
	String type;
	
	public Builder setId(int id) {
		this.id = id;
		return this;
	}
	public Builder setName(String name) {
		this.name = name;
		return this;
	}
	public Builder setType(String type) {
		this.type = type;
		return this;
	}
	
	public Student buildStudent() {
		return new Student(this);
	}
	
}


public class BuilderPatternTest {

	public static void main(String[] args) {
		Builder b = new Builder();
		Student s = b.setId(1).setName("Jagadish").setType("Fulltime").buildStudent();
		Student s1 = b.setId(1).setName("Jagadish").buildStudent();
		System.out.println(s1);
	}

}
