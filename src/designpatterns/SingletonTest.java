package designpatterns;


class Singleton{
	private static Singleton Instance = null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(Instance==null) {
			Instance = new Singleton();
			System.out.println("object created");
		}
		return Instance;
	}
}
public class SingletonTest {

	public static void main(String[] args) {

		Singleton s= Singleton.getInstance();
		//Singleton s1 = Singleton.getInstance();
		
	}

}
