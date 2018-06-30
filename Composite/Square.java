package Composite;

public class Square implements Shape{

	private float width;
	
	@Override
	public float calculateArea() {	
		return width*width;
	}

	public Square(float width) {
		super();
		this.width = width;
	}

}
