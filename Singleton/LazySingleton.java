package Singleton;

public class LazySingleton {
	private static LazySingleton instance=null;
	private LazySingleton(){
	}
	public static LazySingleton getInstance(){
		if(instance==null){
			instance=new LazySingleton();
		}
		return instance;
	}
	public void printType(){
		System.out.println("this is Lazy Singleton");
	}
}
