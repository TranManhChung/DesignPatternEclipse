package Composite;

import java.awt.List;
import java.util.ArrayList;

public class Area implements Shape{

	private ArrayList<Shape> shape;
	
	public Area() {
		super();
		this.shape = new ArrayList<Shape>();
	}

	public void addShape(Shape shape){
		this.shape.add(shape);
	}
	
	@Override
	public float calculateArea() {
		float result=0;
		for(int i=0;i<shape.size();i++){
			result+=shape.get(i).calculateArea();
		}
		return result;
	}

}
