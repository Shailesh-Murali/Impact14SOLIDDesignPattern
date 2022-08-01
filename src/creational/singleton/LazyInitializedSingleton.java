package creational.singleton;


class Singleton3{
	
	private static Singleton3  instance;
	
	private Singleton3() {
		
	}
	
	public static Singleton3 getInstance() {
		
		if(instance==null)
			instance= new Singleton3();
		
		return instance;
	}
	
}
public class LazyInitializedSingleton {

	public static void main(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();
		System.out.println(s1.equals(s2));
	}

}
