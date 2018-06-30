package Singleton;

public class ThreadSafeSingleton {
	
	private static volatile ThreadSafeSingleton instance=null;
	private ThreadSafeSingleton(){
		
	}
	public static ThreadSafeSingleton getInstance(){
		if(instance==null){
			synchronized(ThreadSafeSingleton.class){
				if(instance==null){
					instance=new ThreadSafeSingleton();
				}
			}
		}
		return instance;
	}
	public void printType(){
		System.out.println("this is Eager Singleton");
	}
}
