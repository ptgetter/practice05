package prob6;

public class Rectangle extends Shape implements Resizable {
	
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
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
		return width * height;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public void resize(double s) {
		this.width *= s;
		this.height *= s;
	}

}
