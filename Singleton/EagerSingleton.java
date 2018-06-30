package Singleton;

public class EagerSingleton {

	private static EagerSingleton instance=new EagerSingleton();
	private EagerSingleton(){
		
	}
	public static EagerSingleton getInstance(){
		return instance;
	}
	public void printType(){
		System.out.println("this is Eager Singleton");
	}
}
