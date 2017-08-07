package prob6;

import java.util.ArrayList;

public class ShapeTest {

	public static void main(String[] args) {
		
		Shape rect = new Rectangle(5, 6);
		Shape triangle = new RectTriangle(6, 2);
		ArrayList<Shape> list = new ArrayList<>();
		list.add(rect);
		list.add(triangle);
		
		for(Shape s : list) {
			System.out.println("area: " +  s.getArea());
			System.out.println("perimeter: " +  s.getPerimeter());
			
			if(s instanceof Resizable) {
				((Resizable) s).resize(0.5);
				System.out.println("new area: " +  s.getArea());
				System.out.println("new perimeter: " +  s.getPerimeter());
			}
		}

	}

}
