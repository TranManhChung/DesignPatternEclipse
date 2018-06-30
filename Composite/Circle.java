package Composite;

public class Circle implements Shape{

	private static final float pi=3.14f;
	private float radius;
	
	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		return radius*pi*pi;
	}

}
