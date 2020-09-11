package designpatterns;

interface Vehicle{
	
	//void setName(String name);
}
class Car implements Vehicle{

	
}
class Bike implements Vehicle{
	
}

class Factory{
	
	public Vehicle getVehicle(String name) {
		if(name.equalsIgnoreCase("Car")) {
			System.out.println("Creating car object");
			return new Car();
		}else if(name.equalsIgnoreCase("Bike")) {
			System.out.println("Creating bike object");
			return new Bike();
		}
		return null;
	}
}

public class FactoryPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factory f = new Factory();
		Vehicle car = f.getVehicle("Car");
		Vehicle bike = f.getVehicle("Bike");
	}

}
