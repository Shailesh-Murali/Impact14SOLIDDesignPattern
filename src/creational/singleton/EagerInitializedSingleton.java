package creational.singleton;


class Singleton1{
	
	private static Singleton1  instance= new Singleton1();
	
	private Singleton1() {
		
	}
	
	public static Singleton1 getInstance() {
		return instance;
	}
	
}

public class EagerInitializedSingleton {

	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1.equals(s2));
	}

}
