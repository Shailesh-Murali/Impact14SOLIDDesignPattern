package creational.singleton;

class Singleton2{
	
	private static Singleton2  instance;
	
	static {
		
		instance= new Singleton2();
	}
	private Singleton2() {
		
	}
	
	public static Singleton2 getInstance() {
		return instance;
	}
	
}


public class StaticBlockSingleton {

	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1.equals(s2));
	}

}
