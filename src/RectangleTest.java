public class RectangleTest {

	public static void main(String[] args) {
		
		/* The following creates two rectangle objects
		with Rectangle's two argument constructor. */
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 39.5);
		
		/* The following prints the width, height
		area, and perimeter of Rectangle r1. */
		System.out.println("The rectangle r1 width is: " + r1.getWidth());
		System.out.println("The rectangle r1 height is: " + r1.getHeight());
		System.out.println("The rectangle r1 area is: " + r1.getArea());
		System.out.println("The rectangle r1 perimeter is: " + r1.getPerimeter());
		
		/* The following prints the width, height
		area, and perimeter of Rectangle r2. */
		System.out.println("The rectangle r2 width is: " + r2.getWidth());
		System.out.println("The rectangle r2 height is: " + r2.getHeight());
		System.out.println("The rectangle r2 area is: " + r2.getArea());
		System.out.println("The rectangle r2 perimeter is: " + r2.getPerimeter());
		
	}
}
