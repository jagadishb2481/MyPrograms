package designpatterns;
class Employee implements Cloneable{
	
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	Employee(){
		System.out.println("employee created");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
class Prototype{
	Employee e = new Employee();
	public Employee getEmployee() throws CloneNotSupportedException{
		System.out.println("cloning object");
		return (Employee) e.clone();
	}
}

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Prototype p = new Prototype();
	Employee e =	p.getEmployee();
	e.setName("Jagadish");
	System.out.println(e.getName());
	
	Employee e1 =	p.getEmployee();
	System.out.println(e1.getName());
	}

}
