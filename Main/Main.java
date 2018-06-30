package Main;

import java.awt.Rectangle;

import Composite.Area;
import Composite.Circle;
import Composite.Shape;
import Composite.Square;
import Prototype.ClassOfSchool;
import Prototype.Student;
import Singleton.EagerSingleton;
import Singleton.LazySingleton;
import Singleton.ThreadSafeSingleton;
import Template.BoCucChuongTrinhCoBan;
import Template.QuickSort;
import Template.SelectionSort;

public class Main {
	
	public static void main(String[]args) throws CloneNotSupportedException{
		
		//Singleton
		System.out.println("\n------------SINGLETON DESIGN PATTERN----------");
		LazySingleton lazy=LazySingleton.getInstance();
		EagerSingleton eager=EagerSingleton.getInstance();
		ThreadSafeSingleton threadSafe=ThreadSafeSingleton.getInstance();
		threadSafe.printType();
		lazy.printType();
		eager.printType();
		//end Singleton
		
		//Composite
		System.out.println("\n------------COMPOSITE DESIGN PATTERN----------");
		Area area=new Area();
		Shape square=new Square(3);
		Shape circle=new Circle(3);
		
		area.addShape(square);
		area.addShape(circle);
		
		System.out.println("Dien tich hinh vuong:"+square.calculateArea()+"\n"
							+"Dien tich hinh tron:"+circle.calculateArea());
		System.out.println("Tong dien tich hai hinh:"+area.calculateArea()+"\n");
		//end Composite
		
		//Prototype
		System.out.println("\n------------PROTOTYPE DESIGN PATTERN----------");
		ClassOfSchool classA=new ClassOfSchool("12a1");
		classA.add(new Student("Chung",21));
		classA.add(new Student("Chi",22));
		classA.add(new Student("Na",23));
		classA.add(new Student("Bao",24));
		System.out.println("---------------Shallow copy---------------\nClass A before delete:"+"\n"+classA.toString());
		//copy from classA
		ClassOfSchool classB=(ClassOfSchool) classA.clone();
		ClassOfSchool classC=(ClassOfSchool) classA.cloneDeepCopy();
		//delete
		classA.delete(1);
		//print result after delete
		System.out.println("Class B after delete at index=1 in class A:"+"\n"+classB.toString());		
		System.out.println("Class C after delete at index=1 in class A:"+"\n"+classC.toString());
		//end Prototype
		
		//Template
		System.out.println("\n------------TEMPLATE DESIGN PATTERN----------");
		BoCucChuongTrinhCoBan quickSort=new QuickSort();
		BoCucChuongTrinhCoBan selectionSort=new SelectionSort();
		quickSort.loiChao();
		quickSort.xuLy();
		selectionSort.xuLy();
		quickSort.ketThuc();
		//end Template
	}
}



