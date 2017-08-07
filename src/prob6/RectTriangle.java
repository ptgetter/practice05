package prob6;

public class RectTriangle extends Shape {
	
	private double width;
	private double height;
	
	public RectTriangle(double w, double h)
	{
		this.width = w;
		this.height = h;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height * 0.5;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return width + height + Math.sqrt(width*width + height*height);
	}

}
